package company;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santosh
 */
public class Employee {
    public int age;
    public double salary;
    public Address address;
    
    // Two constructors
    public Employee () {
        
    }
    
    public Employee(int ageValue, double salaryValue, Address addr) {
        age = ageValue;
        salary = salaryValue;
        address = addr;
    }
}
