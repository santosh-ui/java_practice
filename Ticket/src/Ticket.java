/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santosh
 */
public class Ticket {
    
    private int idNumber;
    private String name;
    private String lastName;
    
    // Constructor with parameters
    public Ticket(int idNumber, String name, String lastName) {
        this.idNumber = idNumber;
        this.name = name;
        this.lastName = lastName;
    }
    
    // getter() methods
    public int getIdNumber() {
        return idNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    // setter methods
    public void setIdNumber(int id) {
        idNumber = id;
    }
    
    public void setName(String firstName) {
        name = firstName;
    }
    
    public void setLastName(String lName) {
        lastName = lName;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ticket t1 = new Ticket(123, "santosh", "raju");
        
        System.out.println("ID: "+t1.getIdNumber());
        System.out.println("Name: "+t1.getName());
        System.out.println("Last Name: "+t1.getLastName());
        t1.setIdNumber(567);
        t1.setName("Will");
        t1.setLastName("Smith");
        System.out.println("\nAfter Setters: \n");
        System.out.println("ID: "+t1.getIdNumber());
        System.out.println("Name: "+t1.getName());
        System.out.println("Last Name: "+t1.getLastName());
    }
    
}
