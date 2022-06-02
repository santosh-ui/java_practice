/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test;

import com.example.Car;
/**
 *
 * @author Santosh
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(1998, "Audi", "A1");
        System.out.println("Year: " + car.getYear());
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
    }
}
