
/**
 * Write a description of class ExpenseTracker here.
 *
 * @author Santosh
 * @version 27/02/2023
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class ExpenseTracker
{
    // instance variables - replace the example below with your own
    final static Scanner input = new Scanner(System.in);
    private ArrayList<Expense> expenses;

    /**
     * Constructor for objects of class ExpenseTracker
     */
    public ExpenseTracker()
    {
        // initialise instance variables
        expenses = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void viewExpenses()
    {
        // put your code here
        System.out.print("[\n");
        for (Expense e: expenses) {
            System.out.printf("[%s, %.2f, ", e.getName(), e.getAmount());
            System.out.print(e.getDate() + "]\n");
        }
        System.out.print("]\n");
    }
    
    public void addExpense() {
        Expense e = new Expense();
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        e.setName(name);
        System.out.print("Amount: ");
        double amount = input.nextDouble();
        e.setAmount(amount);
        System.out.print("Date: ");
        String d = input.next();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        Date date;
        
        try {
            if (d.equals("now"))
                date = new Date();
            else
                date = df.parse(d);
            e.setDate(date);
        } catch (ParseException p) {
            p.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        }
        
        expenses.add(e);
    }
    
    public void getMainMenu() {
        System.out.println("Main Menu\n1. View Expenses\n"
        +"2. Add Expense\n"
        +"3. Delete Expense\n"
        +"0. Exit");
    }
    
    public void goToHome() {
        System.out.println("Welcome to ExpenseTracker.\n"
        +"1. Main Menu\n"
        +"0. Exit");
        int menu = input.nextInt();
        while(menu == 1) {
            this.getMainMenu();
            
            int userInput = input.nextInt();
            
            switch (userInput) {
                case 1: 
                    this.viewExpenses();
                    break;
                case 2:
                    this.addExpense();
                    break;
                case 3:
                    System.out.println("Sorry, this feature is still under development.");
                    break;
                case 0:
                    break;
                default:
                    break;
            }
            
            System.out.println("Welcome to ExpenseTracker.\n"
            +"1. Main Menu\n"
            +"0. Exit");
            menu = input.nextInt();
        }
    }
    
    public static void main(String[] args) {
        ExpenseTracker e = new ExpenseTracker();
        e.goToHome();   
        // e.addExpense();
        // e.viewExpenses();
    }
    
    
}
