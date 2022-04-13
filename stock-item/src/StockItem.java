/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santosh
 */
public class StockItem {
    private String description;
    private int level;
    private double price;
    
    public StockItem (String description, double price, int level) {
        this.description = description;
        this.price = price;
        this.level = level;
    }
    
    public static String printReport (StockItem obj) {
        return 
        "*******Stock Report*******\n"+
        "*  Item: " + obj.description + "\n" +
        "*  price: " + obj.price + "p\n" +
        "*  level: " + obj.level + "\n" +
        "***************************";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StockItem item1 = new StockItem("Baked beans 415g", 65, 5);
        System.out.println(printReport(item1));
    }
    
}
