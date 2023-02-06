/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1;

/**
 *
 * @author Santosh
 */

import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
//        char vowels[] = new char[5];
//        vowels[0] = 'a';
//        vowels[1] = 'e';
//        vowels[2] = 'i';
//        vowels[3] = 'o';
//        vowels[4] = 'u';

        char vowels[] = {'u', 'i', 'o', 'e', 'a'};
        
        int startIndex = 1;
        int endIndex = 5; // index one past the last element in the array
        
//        char vowels[] = "uioea"; error: java.lang.String cannot be converted to char[]
        
        System.out.println(vowels[0]);
        // ArrayOps class has a toString() to print out all the elements in the array
        // to use it import it from util.ArrayOps
        System.out.println(Arrays.toString(vowels));
        System.out.println("The length of the array is " + vowels.length);
        
        Arrays.sort(vowels, startIndex, endIndex);

        System.out.println("Sorted array is ");
        System.out.println(Arrays.toString(vowels));
        
        char key = 'i';
//        int foundElementAtIndex = Arrays.binarySearch(vowels, key);
        int foundElementAtIndex = Arrays.binarySearch(vowels, startIndex, endIndex, key);
        System.out.println("Found item " + key + " at index " + foundElementAtIndex);
        
        
    }
}
