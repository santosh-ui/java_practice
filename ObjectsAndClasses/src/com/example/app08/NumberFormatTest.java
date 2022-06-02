/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app08;

//import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author Santosh
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
        System.out.println(nf.getClass().getName());
        System.out.println(nf.format(12323.34));
    }
}
