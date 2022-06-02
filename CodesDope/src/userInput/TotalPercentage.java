/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Santosh
 */
public class TotalPercentage {
    
    public static double total(double[] marks) {
        if(marks.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i<marks.length; i++) {
            sum += marks[i];
        }
        return sum;
    }
    
    public static double percentage(double[] marks) {
        return total(marks)/marks.length;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int noOfSubjects = input.nextInt();
        double[] marks = new double[noOfSubjects];
        
        if (noOfSubjects < 10) {
            for (int i = 0; i<noOfSubjects; i++) {
                double b = input.nextDouble();
                if(b<=100) {
                    marks[i] = b;
                }
            }
        }        
        System.out.println("Total marks: "+total(marks));
        System.out.println("Total percentage: " + percentage(marks) + "%");
    }
}
