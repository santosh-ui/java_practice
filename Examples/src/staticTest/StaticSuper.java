/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticTest;

/**
 *
 * @author Santosh
 */
public class StaticSuper {
    static {
        System.out.println("super static block");
    }
    
    StaticSuper() {
        System.out.println("Super constructor");
    }
}
