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
