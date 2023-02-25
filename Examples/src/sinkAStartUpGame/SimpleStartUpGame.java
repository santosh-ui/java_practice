/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinkAStartUpGame;

/**
 *
 * @author Santosh
 */

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleStartUpGame {
    public static void main(String[] args) {
        int numberOfGuesses = 0;
        SimpleStartUp theStartUp = new SimpleStartUp();
        GameHelper helper = new GameHelper();
                
        // Choose a location to place a start up (a consecutive 3 cells)
//        int randomLocation = ThreadLocalRandom.current().nextInt(0, 5);
//        System.out.println(randomLocation);
        
        int randomNumber = (int) (Math.random() * 5);
//        double randomNumber = Math.random();
        
        int[] randomLocations = {randomNumber, randomNumber + 1, randomNumber + 2};
        
        // place the start-up at a random location on the location cells
        theStartUp.setLocationCells(randomLocations);
        
//        System.out.println(randomNumber);
//        System.out.println(randomNumber * 5);
//        System.out.println(Arrays.toString(theStartUp.locationCells));
        
        boolean isAlive = true;
        int userInput;
        String result;
        while (isAlive == true) {
            userInput = helper.getUserInput();
            result = theStartUp.checkYourself(userInput);
            System.out.println(result);
            numberOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
            }
        }
        
        System.out.println("Number of Guesses: " + numberOfGuesses);

        System.out.println(Arrays.toString(theStartUp.locationCells));
        
    }
}
