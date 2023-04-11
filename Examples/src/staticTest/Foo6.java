/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticTest;

/**
 *
 * @author Santosh
 */
public class Foo6 {
    int x = 6;
    
    /**
     * This static method is legal because
     * it is depending on the non-static content.
     * eg. argument x;
     * @param x 
     */
    public static void go(final int x) {
        System.out.println(x);
    }
}
