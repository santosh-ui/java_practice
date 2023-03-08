/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startup;
import java.util.ArrayList;
/**
 * The final version of the Startup class
 * @author Santosh
 */
public class Startup {
    /**
     * Startup's instance variables
     * - an ArrayList of cell locations
     * - the Startup's name
     */
    private ArrayList<String> locationCells;
    private String name;
    
    // Initialize a new ArrayList Object inside the constructor
    public Startup() {
        locationCells = new ArrayList<>();
    }
    
    // Your basic setter method
    public void setName(String n) {
        name = n;
    }
    
    // A setter method that updates the Startup's location.
    // Random location provided by GameHelper's placeStartup() method
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    
    public String checkYourself(String userGuess) {
        String result = "miss";
        
        // ArrayList's indexOf method in action!
        // if the user guess is one of the entries in the ArrayList,
        // indexOf() returns it's ArrayList location, else
        // indexOf() will return -1.
        int index = locationCells.indexOf(userGuess);
        if (index >= 0) {
            // Using ArrayList's remove method to delete an entry   
            locationCells.remove(index);
            
            // Using the isEmpty() method to see if all the locations
            // have been guessed
            if (locationCells.isEmpty()) {
                result = "kill";
                // Tell the user when Startup has been sunk
                System.out.println("Ouch!, You sunk " + name + " :(");
            } else {
                result = "hit";
            } // end if
        } // end outer if
        // Return: "miss" or "hit" or "kill"
        return result;
    } // end checkYourself method
    
} // close Startup class
