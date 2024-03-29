/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author Santosh
 */
public class SUV extends Car {
    @Override
    public String toString() {
        return "I am an SUV.";
    }
    
    /**
     * run method prints the return value of toString() method of it's parent class Car
     * and also prints the return value of toString() method in this SUV class
     */
    @Override
    public void run() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    
    public static void main(String[] args) {
        SUV suv = new SUV();
        suv.run();
    }
}
