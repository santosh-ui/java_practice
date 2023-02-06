/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app11;

import java.util.Arrays;

/**
 *
 * @author Santosh
 */
public class ElephantTest {
    public static void main(String[] args) {
        Elephant e1 = new Elephant(100.12F, 20);
        Elephant e2 = new Elephant(120.12F, 20);
        Elephant e3 = new Elephant(100.12F, 25);
        
        Elephant[] elephants = new Elephant[3];
        
        elephants[0] = e1;
        elephants[1] = e2;
        elephants[2] = e3;
        
        System.out.println("Before Sorting");
        for(Elephant elephant: elephants) {
            System.out.println(elephant.weight+ " : " + elephant.age);
        }
        
        Arrays.sort(elephants);
        
        System.out.println("After Sorting");
        for(Elephant elephant: elephants) {
            System.out.println(elephant.weight + " : " + elephant.age);
        }
    }
}
