/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter1;

/**
 *
 * @author Santosh
 */

import java.util.Scanner;

public class Chapter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello, World!");
        
        System.out.println("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String formattedString = String.format("My name is %s", name);
        System.out.println(formattedString);
        
        System.out.printf("Hello, %s. How are you? \n", name);
        String howAreYou = input.nextLine();
        System.out.printf("I am %s.\n", howAreYou);
        
        System.out.println("Good. How old are you? ");
        
        // nextInt() method leaves the newline in the buffer
        // so, if you use the nextLine() method after the nextInt()
        // the left over newline in the buffer by the nextInt() kicks in
        // and makes the nextLine() to take the left over newline in the buffer
        // Hence, making the next nextLine() to not take the input.
        // to overcome this put a nextLine() method after the nextInt().

//      int age = input.nextInt();
//      input.nextLine();


        // otherwise we can String input an integer using nextLine() 
        // and then convert the String to an integer using Integer.parseInt() like
        int age = Integer.parseInt(input.nextLine());
        System.out.printf("I am %d years old.\n", age);
        System.out.println("What Language do you prefer?");
        
        
        String language = input.nextLine();

        
        System.out.printf("%s is a very popular programming language.\n", language);
        
        input.close();
    }
    
}
