/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfElse;
import java.util.Scanner;
/**
 *
 * @author Santosh
 */
public class SquareOrNot {
    public static boolean isSquare(double length, double breadth) {
        if(length == breadth) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the Rectangle?");
        double length = input.nextDouble();
        System.out.println("What is the breadth of the Rectangle?");
        double breadth = input.nextDouble();
        
        if(isSquare(length, breadth)) {
            System.out.println("It is a Square.");
        } else {
            System.out.println("It is not a Square.");
        }
    }
}
