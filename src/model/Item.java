/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author patella2
 */
public class Item {
    private String title;
    private float playingTime;
    private String comment;
    private boolean gotIt;

    public Item(String title,  String playingTime, boolean gotIt, String comment){
        this.title = title;
        this.playingTime = 0;
        this.comment = "";
        this.gotIt = true;
    }

    // Display method
    public String display() {
        return "Title: " + title + ", Playing Time: " + playingTime + ", Got It: " + gotIt + ", Comment: " + comment;
    }

}
