/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expensetracker;

/**
 *
 * @author Santosh
 */

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;

public class Expense {
    final private String name;
    final private double amount;
    final private Date date;
    
    /**
     * 
     * @param name
     * @param amount
     * @param date 
     */
    public Expense(String name, double amount, Date date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }
    
    public String getMainMenu() {
        String menu = """
                      1. View Expenses
                      2. Add Expenses
                      3. Exit""";
        return menu;
    }
    
    public String getName() {
        return name;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public Date getDate() {
        return date;
    }
    
    /**
     * @input
     * @return 
     */
    public static String getNameOfExpense() {
        Scanner input = new Scanner(System.in);
        System.out.print("name of expense: ");
        return input.nextLine();
    }
    
    /**
     * @return
     */
    public static double getExpenseAmount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Amount: \b");
        return input.nextDouble();
    }
    
    /**
     * @return
     */
    public static Date getDateOfExpense(){
        Scanner input = new Scanner(System.in);
        System.out.print("Date: ");
        String date = input.next();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        Date d;
        try {
            if (date.equals("now")) {
                return new Date();
            }
            d = df.parse(date);
            return d;
        } catch (ParseException p) {
            System.out.println(p.toString());
        }
        return new Date();
    }
    
    /**
     * 
     * @return 
     */
    public static Expense getExpense() {
        String name = getNameOfExpense();
        double amount = getExpenseAmount();
        Date date = getDateOfExpense();
        return new Expense(name, amount, date);
    }
}
