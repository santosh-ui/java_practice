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
public class ThreeInputs {
    public static String areEqual(String input1, String input2, String input3) {
        if(input1.equals(input2) && input1.equals(input3)) {
            return "Three Strings are equal.";
        } else if(input1.equals(input2) || input1.equals(input3) || input2.equals(input3)) {
            return "Two Strings are equal.";
        }
        return "Three Strings are different from each other";
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String1:");
        String input1 = input.next();
        System.out.println("Enter the String2:");
        String input2 = input.next();
        System.out.println("Enter the Stirng3:");
        String input3 = input.next();
        
        System.out.println(areEqual(input1, input2, input3));
    }
}
