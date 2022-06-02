/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInput;
import java.util.Scanner;
/**
 *
 * @author Santosh
 */
public class TwoInteger {
    
    public static int add(int a, int b) {
        return a+b;
    }
    
    public static int multiply(int a, int b) {
        return a*b;
    }
    
    public static boolean condition(int a, int b) {
        if (a < 50 && a < b) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a = input.nextInt();
        System.out.println("Enter second integer: ");
        int b = input.nextInt();

//        System.out.printf("The sum of a and b is: %d\n", add(a, b));
//        System.out.printf("The product of a and b is: %d", multiply(a, b));
        
        System.out.println("The condition 'a<50' and 'a<b' is " + condition(a, b));
    }
}
