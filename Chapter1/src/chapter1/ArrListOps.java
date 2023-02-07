/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1;

/**
 *
 * @author Santosh
 */

import java.util.ArrayList;
import java.util.Comparator;

public class ArrListOps {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        
//        numbers.remove(3); // numbers.remove(index)
//        numbers.remove(Integer.valueOf(2)); // remove(value)
//        numbers.clear();
//        numbers.set(2, Integer.valueOf(30)); // set(index, value)

//        numbers.sort(Comparator.naturalOrder());
//        numbers.sort(Comparator.reverseOrder());
//        System.out.println(numbers.toString());
//        System.out.println(numbers.size());
//        System.out.println(numbers.contains(Integer.valueOf(4)));
//        System.out.println(numbers.isEmpty());
        System.out.println("Before: " + numbers.toString());
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
    //        System.out.println(numbers.get(numbers.indexOf(number)));
    //        System.out.println(numbers.indexOf(number));
        });
        System.out.println("After: " + numbers.toString());
        
//        System.out.println(numbers.get(3)); // numbers.get(index)
        
    }
}
