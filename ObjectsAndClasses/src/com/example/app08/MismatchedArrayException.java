/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app08;

/**
 *
 * @author Santosh
 */
public class MismatchedArrayException extends Exception{
    private int[] array1;
    private int[] array2;
    
    public MismatchedArrayException(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }
    
    @Override
    public String toString() {
        return "Mismatched Array Length. " + "\n First Array Length is " + array1.length + 
                " Second Array Length is " + array2.length;
    }
}
