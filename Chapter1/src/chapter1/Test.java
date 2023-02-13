/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Santosh
 */

import Library.EBook;
import Library.AudioBook;
import Library.Book;
//import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Book  ramayanam = new Book("Srimadh Ramayanam", "Valmiki Maharshi", 1500);
        AudioBook mahaBharatam = new AudioBook("Maha Bharatham", "Vyasa Maharshi", 2);
        EBook sherlock = new EBook("Sherlock Holmes", "Arthur Conan Doyle", 1200, "PDF");
        System.out.println(ramayanam.toString());
        System.out.println(mahaBharatam.toString());
        System.out.println(sherlock.toString());

//        User user = new User("Jisoo", "1998-03-05");
//        user.name = "Jisoo";
//        user.birthDay = LocalDate.parse("1995-01-03");
//        int age = user.age();
//        user.borrow(book);
//        System.out.printf("%s has borrowed these books: %s\n", user.getName(), user.borrowedBooks());
//        System.out.printf("%s was born on %s. She is %d years old.", user.getName(), 
//                user.getBirthDay(), age);
        
    }
}
