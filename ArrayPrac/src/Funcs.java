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
    
    public static void main(String[] args){
        System.out.println(abs(5));
    }
}
