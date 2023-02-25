/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

/**
 *
 * @author Santosh
 */

import java.util.Arrays;

public class Puzzle4 {
    public static void main(String[] args) {
        Value[] values = new Value[6];
        int number = 1;
        int i = 0;
        while (i < 6) {
            values[i] = new Value();
            values[i].intValue = number;
            number = number * 10;
            System.out.print(values[i].intValue + " ");
            i = i + 1;
        }
        System.out.println();
        
        
        int result = 0;
        i = 6;
        while (i > 0) {
            i = i - 1;
            result = result + values[i].doStuff(i);
            System.out.print(result + " ");
        }
        System.out.println();
        System.out.println("result: " + result);
    }
}

class Value {
    int intValue;
    public int doStuff(int factor) {
        if (intValue > 100) {
            return intValue * factor;
        } else {
            return intValue * (5 - factor);
        }
    }
}
