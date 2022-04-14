/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santosh
 */
public class Funcs {
    
    // absolute value of an int value
    public static int abs(int x) {
        if (x < 0) return -x;
        else return x;
    }
    
    // absolute value of a double value
    public static double abs(double x) {
        if (x < 0.0) return -x;
        else return x;
    }
    
    // primality test
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i*i <= x; i++) 
            if (x%i == 0) return false;
        return true;
    }
    
    // square root (Newton's method)
    public static double sqrt(double c) { 
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > err * t)
        t = (c/t + t) / 2.0;
        return t; 
    }
    
    // Hypotenuse of a right (angled) triangle
    public static double hypotenuse(double height, double base) {
        return (height*height + base*base);
    }
    
    public static double HarmonicNumber(int n) {
        double sum = 0.0;
        for (int i = 1; i <=n; i++) {
            sum += 1.0/i;
        }
        return sum;
    }
    
    public static void main(String[] args){
        System.out.println(abs(5));
        System.out.println(sqrt(9));
        System.out.println(HarmonicNumber(10));
    }
}
