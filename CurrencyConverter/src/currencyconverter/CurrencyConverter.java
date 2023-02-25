/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currencyconverter;

/**
 *
 * @author Santosh
 */

import java.util.Scanner;

public class CurrencyConverter {
    
    public double convertToRupee(double value, double exchangeRate) {
        return value * exchangeRate;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency you currently posses:");
        String changeFrom = input.nextLine();
//        System.out.println();
        
        System.out.println("Enter the amount you want to convert:");
        double value = input.nextDouble();
        
        System.out.println("Enter the currency to which you want to convert:");
        String changeTo = input.next();
        
        System.out.println("What is the Exchange rate now?");
        double exchangeRate  = input.nextDouble();
        
        
        Currency poundSterling = new Currency(changeFrom, value, exchangeRate);
        Currency rupee = new Currency(changeTo);
        CurrencyConverter cc = new CurrencyConverter();
        double rupees = cc.convertToRupee(poundSterling.getValue(), poundSterling.getExchangeRate());
        rupee.setValue(rupees);
        System.out.printf("%.2f Pound Sterling is equal to %.2f Indian Rupees.", poundSterling.getValue(), rupee.getValue());
    }
    
}
