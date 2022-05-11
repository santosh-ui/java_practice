/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book;

/**
 *
 * @author Santosh
 */
public class Book {
    
    int height;
    String isbn;
    int numberOfPages;
    String title;
    int width;
    
    public Chapter getChapter(Chapter chapter) {
        return chapter;
    }
    
    Chapter getChapter() {
        return new Chapter();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book; // if not instantiated, null value is referenced.
        book = null; // satisfy the compiler with null
//        System.out.print(book.title); // Error
        // referenced variable must be initialed before using it;
        if (book == null) {
            book = new Book();            
        }
        System.out.print(book.title);
    }
    
}
