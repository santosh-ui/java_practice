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
public class TwoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first String:");
        String input1 = input.next();
        System.out.println("Enter the second String:");
        String input2 = input.next();
        
        System.out.println(input1+input2);
    }
}
