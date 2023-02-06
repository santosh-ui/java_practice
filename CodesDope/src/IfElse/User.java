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
public class User {
    int age;
    char sex;
    char maritalStatus;
    public User(int age, char sex, char maritalStatus) {
        this.age = age;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
    }
    
    public static String placeOfService(int age, char sex) {
        
        if (age <20 && age >60) return "ERROR";
        
        if (sex == 'F') {
            return "Urban area";
        } else if (age>=20 && age <40) {
            return "Anywhere";
        } else if (age>=40 && age <=60) return "Urban area only";
        
        return "ERROR";
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your age:");
        int age = input.nextInt();
    //    enum sex{
    //        'M', 'F'
    //    }
        System.out.println("Enter Your sex:");
        char sex = input.next().charAt(0) == 'M' ? 'M' : 'F';
        System.out.println("Enter Your Marital Status:");
        char maritalStatus = input.next().charAt(0) == 'Y'? 'Y' : 'N';
        String placeOfService;
        System.out.println("Hi, Papa Rayudu. Enter age(20 to 60), sex(M/F), marital status(Y/N)");
//        User papaRayudu = new User(input.nextInt(), input.next().charAt(0), input.next().charAt(0));
//        User papaRayudu = new User(age, sex, maritalStatus);
        placeOfService = placeOfService(age, sex);
        System.out.println("Your place of service is: " + placeOfService);
        System.out.println("Marital Status:" + maritalStatus);
    }
}
