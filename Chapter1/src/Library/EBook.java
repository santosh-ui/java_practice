/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Santosh
 */
public class EBook extends Book{
    final private String format;
    
    public EBook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        this.format = format;
    }
    
}
