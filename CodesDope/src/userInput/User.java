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
public class User {
    private String name;
    private String rollNo;
    private String fieldOfInterest;
    
    public User(){
        
    }
    
    public User(String name, String rollNo, String fieldOfInterest){
        this.name = name;
        this.rollNo = rollNo;
        this.fieldOfInterest = fieldOfInterest;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user1 = new User("Santosh", "20074376", "Computer Science");
        System.out.println("Enter your name: ");
        user1.name = input.next();
        System.out.println("Enter your roll number: ");
        user1.rollNo = input.next();
        System.out.println("Enter your field of interest: ");
        // To consume '\n' left by ENTER key, it is not comsumed by next()
        input.next();
        user1.fieldOfInterest = input.nextLine();
        
        System.out.println("Hi, my name is " + user1.name + 
                " and my roll number is " + user1.rollNo + 
                ". My field of interest is " + user1.fieldOfInterest + ".");
    }
}
