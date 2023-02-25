/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

/**
 *
 * @author Santosh
 */
public class BeTheCompiler {
    public static void main(String[] args) {
        int orig = 42;
        BeTheCompiler b = new BeTheCompiler();
        int y = b.go(orig);
        System.out.println(orig + " " + y);
    }
    
    int go(int arg) {
        arg *= 2;
        return arg;
    }
}
