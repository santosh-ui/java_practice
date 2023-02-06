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
public class Attendence {
    public static double attendencePer(int clsHld, int clsAttnd) {
        double att = ((double)clsAttnd/clsHld) * 100;
//        System.out.println(((double)clsAttnd/clsHld)*100);
        return att;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the classes held:");
        int clsHld = input.nextInt();
        System.out.println("Enter the classes attended:");
        int clsAttnd = input.nextInt();
        double attndPer = attendencePer(clsHld, clsAttnd);
        System.out.println("Attendence Percentage is " + attndPer);
        System.out.println("Do you have a medical cause? y/n");
        String yesOrNo = input.next();
        boolean medicalCause = false;
        String reason = "";
        if (yesOrNo.equals("y")) {
            medicalCause = true;
            System.out.println("Enter the reason:");
            reason = input.next();
        }
                
        if(attndPer >= 75.0) {
            System.out.println("You are allowed to sit in the exam.");
        } else if(medicalCause) {
            System.out.println("You are allowed to sit in the exam because you hava a medical cause:" + reason);
        } else
            System.out.println("Your attendence percentage is less than 75."
                    + " So, You are not allowed to sit in the exam.");
    }
}
