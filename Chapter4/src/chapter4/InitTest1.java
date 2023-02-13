/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author Santosh
 */
public class InitTest1 {
    int x = 5;
    int y;
    public static int z = 2; // static vars don't need an instance creation to be initialized
    
    // instance initialization code
    {
        y = x * 2;
        System.out.println("y = " + y);
        System.out.println(z); // static var z can be accessed from non-static context
    }
    //static initialization code
    static {
        System.out.println("Static Initialization");
//        System.out.println(x); // error: non-static var x can't be accessed from static context
    }
    
    public static void main(String[] args) {
        InitTest1 test = new InitTest1();
        InitTest1 moreTest = new InitTest1();
        System.out.println(test.x);
        System.out.println(moreTest.x);

    }
}
