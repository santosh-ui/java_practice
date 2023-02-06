/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfElse;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Santosh
 */
public class Age {
    public static int max(int[] a) {
        int max = 0;
        for (int i = 0; i<a.length; i++) {
            int b = a[i];
            if (b > max) {
                max = b;
            }
        }
        return max;
    }
    
    public static int min(int[] a) {
        int min = Integer.MAX_VALUE;
//        System.out.println(min);
        int b = 0;
        for (int i = 0; i<a.length; i++) {
            b = a[i];
            if (b < min) {
                min = b;
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of 3 people:");
        int ages[] = new int[3];
        for (int i = 0; i<3; i++) {
            ages[i] = input.nextInt();
        }
        System.out.println("The oldest person is " + max(ages) + " years old.");
        System.out.println("Youngest person is " + min(ages) + " years old.");
    }
}
