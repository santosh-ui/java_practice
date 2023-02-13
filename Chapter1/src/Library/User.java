/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Santosh
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    final private String name;
    final private LocalDate birthDay;
    final private ArrayList<Book> books = new ArrayList<>();
    
    public User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getBirthDay() {
        return this.birthDay.toString();
    }
    
    public int age(){
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }
    
    public String borrowedBooks() {
        return books.toString();
    }
    
    public void borrow(Book book) {
        this.books.add(book);
    }
}
