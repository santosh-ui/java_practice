
/**
 * Write a description of class Expense here.
 *
 * @author Santosh
 * @version 27/02/2023
 */
import java.util.Date;

public class Expense
{
    // instance variables - replace the example below with your own
    private String name;
    private double amount;
    private Date date;

    /**
     * Constructor for objects of class Expense
     */
    public Expense()
    {
        // initialise instance variables
        
    }
    
    public Expense(String name, double amount, Date date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * get amount
     * @return amount
     */
    public double getAmount(){
        return amount;
    }
    
    /**
     * get date
     * @return date of purchase
     */
    public Date getDate() {
        return date;
    }
    
    /**
     * set name of expense
     * @param name - String
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * set amount of expense
     * @param amoutn - double
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    /**
     * set date of expense
     * @param date - Date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
