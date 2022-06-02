/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app08;

/**
 *
 * @author Santosh
 */
public class Util {
    public static long[] addArrays(int[] array1, int[] array2) 
    throws MismatchedArrayException, java.lang.NullPointerException
    {
        if (array1 == null || array2 == null) {
            throw new NullPointerException("One of the Arrays is Null.");
        }
        
        if (array1.length != array2.length) {
            throw new MismatchedArrayException(array1, array2);
        }
        
        int length = array1.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = (long) array1[i] + array2[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] array1 = {23, 44, 4564, 1000, 344, 54};
        int[] array2 = {2345, 35, 4, 34, Integer.MAX_VALUE, 353};
        int[] array3 = {234, 65, 4};
        int[] array4 = null;
        try {
        long[] result = addArrays(array1, array4);
        System.out.println("Result: " + result);
//        System.out.println(Arrays.toString(result));
        } catch( MismatchedArrayException e) {
            System.out.println(e);
        } catch(NullPointerException e) {
            System.out.println(e);
        }
    }
}
