/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expensetracker;

/**
 *
 * @author Santosh
 */

//import java.util.Arrays;
import java.util.ArrayList;

public class ExpenseTracker {
    
    final private ArrayList<Expense> expenses;

    public ExpenseTracker() {
        this.expenses = new ArrayList<>();
    }
    
    /**
     * adds an expense to the expenses array
     * @param expense
     */
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }
    
    /**
     * Shows all the expenses in the expenses array
     */
    
    public void viewExpenses() {
        System.out.print("[");
        for (Expense e: expenses) {
            System.out.printf("[name: %s, amount: %.2f, ", e.getName(), e.getAmount());
            System.out.print(e.getDate() + "]");
        }
        System.out.print("]");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
