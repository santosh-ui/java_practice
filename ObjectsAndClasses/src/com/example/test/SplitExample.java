/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test;

import java.util.StringTokenizer;
/**
 *
 * @author Santosh
 */
public class SplitExample {
    public static void main(String[] args) {
        String text = "Energy   efficient car";
        String[] tokens = text.split(" ");
        System.out.format("Number of tokens in (String.split()): %d \n", tokens.length);
        for (String token: tokens) {
            System.out.println("-" + token);
        }
        System.out.println("---------------------------------------");
        tokens = text.split("\\s+");
        System.out.format("Number of tokens in (String.split()): %d \n", tokens.length);
        for (String token: tokens) {
            System.out.println("-" + token);
        }
        System.out.println("---------------------------------------");
        StringTokenizer stringTokenizer = new StringTokenizer(text, " ");
        System.out.println("Number of tokens in (StringTokenizer): \n" + stringTokenizer.countTokens());
        System.out.println("Tokens (StringTokenizer): ");
        while(stringTokenizer.hasMoreTokens()){
            System.out.println("-" + stringTokenizer.nextToken());
        }
    }
    
    // with these examples we can see that split() method of String class has more flexibility 
    // than the StringTokenizer, split() can use regex as delimiter.
    // we should opt String.split() over StringTokenizer.
    // Also learn about String interning.    
}
