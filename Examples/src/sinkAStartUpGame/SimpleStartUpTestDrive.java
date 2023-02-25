/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinkAStartUpGame;

/**
 *
 * @author Santosh
 */
public class SimpleStartUpTestDrive {
    public static void main(String[] args) {
        // Create/Instantiate a SimpleStartUp object
        SimpleStartUp dot = new SimpleStartUp();
        
        // Make an int array for the location of the start up
        // 3 consecutive ints out of 7
//        int[] locations = {2, 3, 4};
        // invoke the setter method on the start up
//        dot.setLocationCells(locations);
        
        // Make a fake user guess
        int userGuess = 2;
        
        // invoke the checkYourself method on the SimpleStartUp object
        // and pass it the fake user guess
        String result = dot.checkYourself(userGuess);
        
        String testResult = "failed";
        
        if (result.equals("hit")) {
            testResult = "Passed";
        }
        
        System.out.println(testResult);
        
    }
}
