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
public class Grade {
    public static char gradeCalculator(double marks) {
        if (marks<0 || marks>100) {
            System.out.println("Invalid marks!");
            return 'F';
        }
        
        if (marks < 25) {
            return 'F';
        } else if(marks >=25 && marks <=45) {
            return 'E';
        } else if(marks > 45 && marks <=50) {
            return 'D';
        } else if(marks>50 && marks <=60) {
            return 'C';
        } else if(marks > 60 && marks <=80) {
            return 'B';
        } else return 'A';        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks:");
        double marks = input.nextDouble();
        System.out.println("You got " + gradeCalculator(marks) + " grade.");
    }
}
