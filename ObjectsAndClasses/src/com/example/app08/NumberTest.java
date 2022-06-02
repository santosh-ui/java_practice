/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app08;


import java.util.Scanner;
/**
 *
 * @author Santosh
 */
public class NumberTest {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();
        try {
            int number = Integer.parseInt(userInput);
            System.out.println("The Number entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid User Input.");
        }
    }
}
