# CSJAVA-Aston Course. 
Demonstrating Java based concepts in Inheritance


# The Case for Inheritance in Java

## Overview

### 1. Inheritance
Inheritance is a mechanism that allows a new class (subclass/derived class) to adopt properties (attributes) and behaviors (methods) from an existing class (superclass/base class).

### 2. Benefits of Inheritance
- **Code Reusability**: Avoid duplication by inheriting common properties and behaviors.
- **Extensibility**: Extend the functionalities of existing classes without altering them.
- **Hierarchical Classifications**: Represent real-world relationships hierarchically.

### 3. Key Terminology
- **Base/Superclass**: The class being extended or inherited from.
- **Derived/Subclass**: The class that inherits properties and behaviors from the superclass.
- **`super`**: A keyword in Java used to refer to the immediate parent class object. Useful for calling the superclass's constructor or its methods.
- **Method Overriding**: When a subclass provides a specific implementation of a method that is already defined in its superclass.

### 4. `extends` Keyword
In Java, the `extends` keyword is used to declare inheritance.

## Summary

Inheritance is a foundational pillar of object-oriented programming (OOP). It allows for the creation of a new class based on an existing class, inheriting its attributes and behaviors. This promotes code reuse and establishes a natural hierarchy between objects, mirroring real-world relationships. In Java, this is achieved using the `extends` keyword. Additionally, Java supports method overriding, allowing subclasses to provide specialized implementations without altering the superclass.

## Example: Multimedia Database (DoME)

### Scenario
- We want to store details about multimedia items: CDs and DVDs.
- Common properties: `title`, `playingTime`, `gotIt`, `comment`.
- CD-specific properties: `artist`, `tracks`.
- DVD-specific properties: `director`.

### Implementation

1. **Multimedia Class** (Base Class):
    - Contains common properties and a method to display details.

2. **CD Class** (Subclass of Multimedia):
    - Inherits common properties from Multimedia.
    - Contains CD-specific properties.
    - Overrides the display method to include CD-specific details.

3. **DVD Class** (Subclass of Multimedia):
    - Inherits common properties from Multimedia.
    - Contains DVD-specific properties.
    - Overrides the display method to include DVD-specific details.

This design showcases the power of inheritance: common functionalities are defined once in the `Multimedia` class and specialized functionalities are added in the subclasses `CD` and `DVD`.




### **Unit 3: Polymorphism and Overriding (Summary with Code Examples)**

This unit covers **Polymorphism**, **Method Overriding**, **Dynamic Method Lookup**, **Wrapper Classes**, **Autoboxing/Unboxing**, and the **Java Collections Framework**. Below is a breakdown with **key concepts and code examples**.

---

## **1. Primitive and Object Types**
Java has two types of data:
- **Primitive types**: `int`, `boolean`, `char`, `double`, `long`, etc.
- **Object types**: Created from **classes** (`String`, `Integer`, `ArrayList`, etc.)

### **Example: Memory Allocation**
```java
int a = 10;  // Primitive type (stores value directly)
Integer b = new Integer(10); // Object type (stores reference)
```

---

## **2. Generic Collections**
Java provides **Collections Framework** to store groups of objects dynamically.

### **Array Example**
```java
int[] myArray = new int[3];  
myArray[0] = 10;
```
**Limitations of Arrays:**
- Fixed size
- No built-in methods for searching or sorting

### **Using ArrayList**
```java
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
System.out.println(numbers); // [10, 20, 30]
```

---

## **3. Wrapper Classes & Autoboxing**
Java provides **wrapper classes** to convert primitive types into objects.

### **Example of Wrapper Class**
```java
Integer num = Integer.valueOf(5); // Boxing: int → Integer
int x = num.intValue(); // Unboxing: Integer → int
```

### **Autoboxing & Unboxing (Automatic)**
```java
Integer y = 10;  // Autoboxing (int → Integer)
int z = y;       // Unboxing (Integer → int)
```

---

## **4. Overriding (Polymorphism)**
Method **overriding** allows a subclass to provide a specific implementation of a method already defined in its superclass.

### **Example Without Overriding**
```java
class Item {
    String title = "Generic Item";
    public void print() {
        System.out.println("Title: " + title);
    }
}

class CD extends Item {
    String artist = "Unknown Artist";
    public void print() {
        System.out.println("Artist: " + artist); // Doesn't call superclass print()
    }
}

public class Main {
    public static void main(String[] args) {
        Item obj = new CD();
        obj.print(); // Calls the Item's print() instead of CD's print()
    }
}
```
**Issue:** Since the method `print()` is not overridden, `Item`'s version is called instead of `CD`'s.

### **Correct Overriding Example**
```java
class Item {
    String title;
    public void print() {
        System.out.println("Title: " + title);
    }
}

class CD extends Item {
    String artist;
    
    @Override
    public void print() {
        super.print(); // Calls parent class method
        System.out.println("Artist: " + artist);
    }
}

public class Main {
    public static void main(String[] args) {
        Item obj = new CD();
        obj.print(); // Calls CD's print(), not Item's print()
    }
}
```
**Key Points:**
- `@Override` ensures proper method overriding.
- `super.print()` calls the superclass method before adding subclass behavior.

---

## **5. Superclass and Subclass Relations**
The **super** keyword is used to access parent class methods.

### **Example of Using `super`**
```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound(); // Calls Animal's method
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
```
**Output:**
```
Animal makes a sound
Dog barks
```

---

## **6. Static vs Dynamic Type**
- **Static Type** → Declared type of a variable (checked at compile-time).
- **Dynamic Type** → Actual type of the object (determined at runtime).

### **Example: Static vs Dynamic Type**
```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car(); // Static type: Vehicle, Dynamic type: Car
        v1.start();  // Calls Car's start() because dynamic type matters
    }
}
```
**Output:**
```
Car is starting
```

---

## **7. Dynamic Method Lookup**
Dynamic method lookup ensures that the **most specific** overridden method is called.

### **Method Lookup Steps**
1. Check the **actual object type** (dynamic type).
2. Look for the method in that class.
3. If not found, move up to the **superclass**.
4. Continue until the method is found or reach the top of the hierarchy.

---

## **8. Overloading vs Overriding**
| **Feature**     | **Overloading** | **Overriding** |
|----------------|---------------|---------------|
| Definition    | Same method name, different parameters | Subclass provides a new implementation of a method |
| When?        | Compile-time   | Runtime |
| Return Type  | Can be different | Must be the same |
| Parameters   | Must be different | Must be the same |
| `@Override` Needed? | No | Yes |

### **Example: Overloading**
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(2, 3));       // Calls int version
        System.out.println(obj.add(2.5, 3.5));   // Calls double version
    }
}
```

---

## **9. `@Override` Annotation**
The `@Override` annotation **prevents mistakes** when overriding methods.

### **Example with Typo**
```java
class Parent {
    void show() {}
}

class Child extends Parent {
    @Override
    void show() {} // Correct override

    // void shw() {} // Wrong: Wouldn't override anything
}
```

---

## **10. Summary**
✔ **Primitive vs Object Types** → Objects store references, primitives store values.  
✔ **Java Collections** → `ArrayList`, `HashSet`, `HashMap` for dynamic storage.  
✔ **Wrapper Classes** → Convert primitives to objects (`Integer`, `Double`, etc.).  
✔ **Autoboxing/Unboxing** → Automatic conversion of primitives to wrapper classes.  
✔ **Overriding** → Subclass redefines superclass method (`@Override` ensures correctness).  
✔ **super Keyword** → Calls the superclass version of a method.  
✔ **Static vs Dynamic Type** → Static type is checked at compile-time, dynamic at runtime.  
✔ **Method Lookup** → Starts at dynamic type and moves up hierarchy.  
✔ **Overloading vs Overriding** → Overloading = same name, different params. Overriding = subclass redefines method.

---

This **unit introduces core OOP concepts** and prepares you for writing maintainable and scalable Java code! 🚀 Let me know if you need more clarifications! 😊
