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
public class Experssions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int x = 2, y = 5, z = 0;
//        
//        System.out.println(x==2);
//        System.out.println(x!=5);
//        System.out.println(x!=5 && y>=5);
//        System.out.println(z!=0 || x==2);
//        System.out.println(!(y<10));
        System.out.println("Enter a character:");
        char ch = input.next().charAt(0);
        int value = ch;
        if (value >=60 && value<=90) {
            System.out.println("Entered character is uppercase");
        } else if(value>=97 && value<=122) System.out.println("Entered character is lowercase");
        else System.out.println("Invalid character!");
        input.close();
    }
}
