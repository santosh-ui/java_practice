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

//        char vowels[] = {'u', 'i', 'o', 'e', 'a'};
        
//        int startIndex = 1;
//        int endIndex = 5; // index one past the last element in the array
        
//        char vowels[] = "uioea"; error: java.lang.String cannot be converted to char[]
        
//        System.out.println(vowels[0]);
        // ArrayOps class has a toString() to print out all the elements in the array
        // to use it import it from util.ArrayOps
//        System.out.println(Arrays.toString(vowels));
//        System.out.println("The length of the array is " + vowels.length);
        
//        System.out.println(Arrays.toString(vowels));
//        System.out.println("The length of the array is " + vowels.length);
        
//        Arrays.sort(vowels);
//        Arrays.sort(vowels, startIndex, endIndex);

//        System.out.println("Sorted array is " + Arrays.toString(vowels));
        
//        char key = 's';
//        int foundElementAtIndex = Arrays.binarySearch(vowels, key);
//        int foundElementAtIndex = Arrays.binarySearch(vowels, startIndex, endIndex, key);
//        System.out.println("Found item " + key + " at index " + foundElementAtIndex);
        // the result will always be a negative number if the item is not in the array
        
//        Arrays.fill(vowels, 'a');
//        System.out.println("vowels array: " + Arrays.toString(vowels));

        int arrInt[] = {1, 2, 3, 4, 5};
//        int copyInt[] = arrInt;
        // Arrays are reference types:
        // making a copy of an array just make the new variable to reference the original array
        // if we make any chages to the reference array the changes are being applied to the 
        // referenced array.
        
        // instead use Arrays.copyOf() to make a copy
        int copyInt[] = Arrays.copyOf(arrInt, arrInt.length);
//        int copyInt[] = Arrays.copyOfRange(arrInt, startIndex, endIndex);

//        Arrays.fill(arrInt, 0);
        
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(copyInt));
//        System.out.println(arrInt == copyInt);
        System.out.println(Arrays.equals(arrInt, copyInt));
        
    }
}
