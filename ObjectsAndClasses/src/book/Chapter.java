/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author Santosh
 */
public class Chapter {
    public String title;
    public int numberOfPages;
    
    public void review() {
        Page page = new Page();
        int sentenceCount = page.numberOfSentences;
        int pageNumber = page.getPageNumber();
    }
}
