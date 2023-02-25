/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app08;

/**
 *
 * @author Santosh
 */

import java.util.Arrays;
public class Util {
    public static long[] addArray(int array1[], int array2[]) 
    throws MismatchedArrayException, java.lang.NullPointerException{
        if (array1 == null || array2 == null) {
            // "One of the arrays is null"
            throw new NullPointerException("One of the arrays is null");
        }

        if (array1.length != array2.length) {
            throw new MismatchedArrayException(array1, array2);
        }
        
        int length = array1.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = (long)array1[i] + array2[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, Integer.MIN_VALUE};
        int[] array2 = {6, 7, 8, 9, Integer.MAX_VALUE};
        int[] array3 = {8, 9};
        int[] array4 = null;
        
        try {
            long[] result = addArray(array1, array4);
            System.out.println(Arrays.toString(result));
        } catch (MismatchedArrayException m) {
            System.out.println(m.toString());
        } catch (java.lang.NullPointerException n) {
            System.out.println(n.toString());
        } catch (java.lang.RuntimeException r) {
            System.out.println(r.toString());
        }
    }
}
