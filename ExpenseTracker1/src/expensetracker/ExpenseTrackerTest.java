/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expensetracker;

/**
 *
 * @author Santosh
 */
public class ExpenseTrackerTest {
    public static void main(String[] args) {
        ExpenseTracker et = new ExpenseTracker();
        // Create an Expense instance
        Expense expense = Expense.getExpense();
        // Adds a new expense to the expense tracker
        expense.getMainMenu();
        et.addExpense(expense);
        // Displays all the expenses currently in the expense tracker
        et.viewExpenses();
        // Deletes an expense by name
//        et.deleteExpense(String name);
        // Calculates and returns the total expenses
//        et.getTotalExpenses();
        // Calculates and returns the expenses for a given month and year   
//        et.getExpensesByMonth(int month, int year);
        // Calculates and returns the expenses for a given category
//        et.getExpenseByCategory(String category);
    }
}
