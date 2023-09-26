package controller;
import model.CD;
import model.Item;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// DVD class inheriting from Multimedia
public class Engine extends Item {
    private String director;

    // Constructor
    public Engine(String title, String director, String playingTime, boolean gotIt, String comment) {
        super(title, playingTime, gotIt, comment);
        this.director = director;
    }

    // Overriding the display method
    @Override
    public String display() {
        return super.display() + ", Director: " + director;
    }
}
