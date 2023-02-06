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
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        if((year%400) == 0) {
            System.out.println("Leap Year!");
        } else if ((year%4) == 0) {
            System.out.println("Leap Year!");
        } else System.out.println("Not a Leap Year!");
    }
    
}
