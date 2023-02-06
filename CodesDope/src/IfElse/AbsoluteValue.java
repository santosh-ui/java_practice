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
public class AbsoluteValue {
    public static int absoluteValue(int a) {
        if (a>0) {
            return a;
        } else return Math.abs(a);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        System.out.println("The absolute value of the number is " + absoluteValue(a));
    }
}
