/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Santosh
 */

//import java.time.Duration;

public class AudioBook extends Book{
    final private double runtime;
    
    public AudioBook(String title, String author, double runtime) {
        super(title, author, 0);
        this.runtime = runtime;
    }
    
}
