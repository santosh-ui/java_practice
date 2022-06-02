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
public class SquareOfANumber {
    public static int sqr(int number) {
        return number * number;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = input.nextInt();
        
        System.out.println("The square of the Number is: " + sqr(number));
    }
}
