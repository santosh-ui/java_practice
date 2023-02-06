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
public class Bonus {
    
    public static double bonus(double salary, int yearsOfService) {
        double bonus;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
            System.out.println(bonus);
            return bonus;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        double salary;
        int yearsOfService;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary:");
        salary = input.nextDouble();
        System.out.println("Enter your years of service:");
        yearsOfService = input.nextInt();
        double bonus = bonus(salary, yearsOfService);
//        System.out.println(bonus);
        System.out.println("You got £" + bonus +" bonus.");
    }
}
