/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticTest;

/**
 *
 * @author Santosh
 */
public class StaticTests extends StaticSuper{
    /**
     * whenever the JVM encounters extends keyword,
     * it first loads the Super class and then 
     * the class that extends it.
     * But, it won't call the constructor yet.
     */
    static int rand;
    
    static {
        rand = (int) (Math.random() * 6);
        System.out.println("Static block " + rand);
    }
    
    StaticTests() {
        /**
         * If you don't specify the Super()
         * compiler do it for you.
         */
        System.out.println("Test constructor");
    }
    
    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}
