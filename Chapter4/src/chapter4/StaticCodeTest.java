/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author Santosh
 */
public class StaticCodeTest {

    /**
     *
     */
    public static final int A = 5;

    /**
     *
     */
    public static int b = A * 2;
    static {
        System.out.println("static block");
        System.out.println(A);
//        System.out.println(b);
    }
    
    public static void main(String[] args) {
        System.out.println("main method");
//        System.out.println(a);
        System.out.println(b);
    }
}
