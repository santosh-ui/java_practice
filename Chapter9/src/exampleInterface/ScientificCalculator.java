/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampleInterface;

/**
 *
 * @author Santosh
 */
public class ScientificCalculator implements Calculator {
    
    @Override
    public long add(int a, int b) {
        return a + b;
    }
    
    @Override
    public long subtract(int a, int b) {
        return a - b;
    }
    
    @Override
    public long multiply(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        ScientificCalculator s = new ScientificCalculator();
        long sum = s.add(a, b);
        System.out.println(sum);
    }
}
