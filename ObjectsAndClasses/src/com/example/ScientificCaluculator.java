/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author Santosh
 */
public class ScientificCaluculator implements Calculator {
    @Override
    public long add(int a, int b) {
        return a + b;
    }
    
    @Override
    public long subtract(int a, int b) {        
        return a - b;
    }
    
    @Override
    public long multiply(int a, int b) {
        return a * b;
    }
}
