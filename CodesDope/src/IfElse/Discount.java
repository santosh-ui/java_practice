/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfElse;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Santosh
 */
public class Discount {
    public static double discount(ArrayList items) {
        double sum = 0;
        double discount = 0;
        for (int i = 0; i < items.size(); i++) {
            double item = (double)items.get(i);
            sum += item;
        }
        if (sum > 1000) {
            // write code here.
        }
        
        return discount;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the quantity of your purchace:");
        int quantity = input.nextInt();
        ArrayList<Double> items = new ArrayList<Double>(quantity);
        
        System.out.println("Enter the price of each item");
        for (int i = 0; i < quantity; i++) {
            items.add(input.nextDouble());
        }
        
        System.out.println(items);
        
//        for (Iterator iterator = items.iterator(); iterator.hasNext();) {
//            double item = (double) iterator.next();
//            System.out.println(item);
//        }
    }
}
