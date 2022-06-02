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
public class TwoDouble {
    
    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }
    
    public static double areaOfSquare(double side) {
        return side*side;
    }
    
    public static double perimeterOfSquare(double side) {
        return 4 * side;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();
        System.out.println("Enter the side of the square: ");
        double side = input.nextDouble();
        
        System.out.printf("The area of the rectangle is: %d.\n", (int)areaOfRectangle(length, breadth));
        System.out.println("The area of the square is " + areaOfSquare(side) + " and the perimeter of the square is " + perimeterOfSquare(side) + ".");
    }
}
