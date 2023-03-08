/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinkAStartUpGame;

/**
 *
 * @author Santosh
 */

public class SimpleStartUp {
    public int[] locationCells; // variable to hold the array of ints
    public int numberOfHits;
    
    private int indexOf(int guess) {
        for (int i = 0; i < locationCells.length; i++ ){
            if (locationCells[i] == guess) {
                return i;
            }
        }
        return guess;
    }
    // places the start-up in the location that is passed in as a parameter
    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }
    
    /*
    * checkYourself method to check if the user guess is correct
    * "hit"/"miss"
    */
    public String checkYourself(int guess) {
        // Make the variable hold the result we return
        // Put "miss" in as a default
        String result = "miss";
        
        // Repeat with each cell in the locationCells array
        // (Each cell location of the object)
        for (int cell: locationCells) {
            //compare the user guess to this element (cell) in the array
            if (guess == cell) { // if the cell = guess
                int index = indexOf(guess);
                locationCells[index] = -1;
                result = "hit"; // we got hit
                numberOfHits++; // increment number of hits
                break; // break out of the for loop
                // no need to test the other cells
            }
        }
        
        
//        if ()

        // we're out of the loop but let's see if we are 'dead' now
        // hit 3 times and change the result string to kill
        if (numberOfHits == locationCells.length) {
            result = "kill";
        }
        
        return result;
    }
}
