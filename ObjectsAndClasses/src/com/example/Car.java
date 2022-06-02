/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author Santosh
 */

// Immutable class example that has only private fields and only get methods
// without set methods
public class Car {
    private int year;
    private String make;
    private String model;
    
    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
}
