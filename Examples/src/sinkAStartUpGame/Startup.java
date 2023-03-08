/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinkAStartUpGame;

import java.util.ArrayList;
/**
 *
 * @author Santosh
 */
public class Startup {
    // change the int array to ArrayList that holds Strings;
    private ArrayList<String> locationCells;
    // private int numberOfHits;
    // don't need to track this now;
    
    // this is now a String - it needs to accept values like "A1", "B2", ...
    
    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }
    
    public String checkYourself(String userInput) { // new and improved argument name
        String result = "miss";
        
        int index = locationCells.indexOf(userInput);
        
        // if the index is greater than or equal to 0;
        // the userInput is definitely in the list. so, remove it
        if (index >= 0) {
            locationCells.remove(index);
            // if the list is empty. All the cells in the Startup were hit
            // this was the killing blow.
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
    
}
