/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfElse;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Santosh
 */
public class Discount {
    
    public static double total(ArrayList items) {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            double item = (double)items.get(i);
            total += item;
        }
        return total;
    }
    public static double discount10percent(double total) {
        double discount = 0;
        if (total > 1000) {
            // write code here.
            discount = total * 0.1;
        }
        
        return discount;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the quantity of your purchace:");
        int quantity = input.nextInt();
        ArrayList<Double> items = new ArrayList<>(quantity);
        
        System.out.println("Enter the price of each item");
        for (int i = 0; i < quantity; i++) {
            items.add(input.nextDouble());
        }
        
        System.out.println(items);
        double total = total(items);
        double discount = discount10percent(total);
        System.out.println("The discount is " + discount);
        System.out.println("The final cost is: " + (total - discount));
        
        
//        for (Iterator iterator = items.iterator(); iterator.hasNext();) {
//            double item = (double) iterator.next();
//            System.out.println(item);
//        }
    }
}
