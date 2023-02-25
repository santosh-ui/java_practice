/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app08;

/**
 *
 * @author Santosh
 */
public class MismatchedArrayException extends Exception{
    final private int[] array1;
    final private int[] array2;
    
    public MismatchedArrayException(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }
    
    @Override
    public String toString() {
        return "Mismatched array length. The first array's length is "
                + array1.length + ". The second array's length is "
                + array2.length + ".";
    }
}
