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
public class GreatestInteger {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers");
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.printf("The greatest integer is %d", max(a, b));
    }
}
