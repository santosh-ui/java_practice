/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatedjukeboxsystem;

import java.util.List;
import java.util.Collections;

/**
 *
 * @author Santosh
 */
public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }
    
    public static void go() {
        // we'll store the song titles in the list of Strings
//        List<String> songList = MockSongs.getSongs();
        // Then print the contents of the song list
//        System.out.println(songList);
        // Sort our songs list using "natural ordering"
//        Collections.sort(songList);
//        System.out.println(songList);


        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);
        /**
         * There is an RunTimeException while running the below code.
         * It is due to the element in the list didn't implement the Comparable interface.
         * as every element in the list need to implement it.
         * we didn't see this exception when running the list of strings 
         * because String class already implemented it.
         */
        Collections.sort(songList);
        System.out.println(songList);
        
        /**
        * What if I want to sort the songs by artist
        * there’s something much better.
        * Something built into the API for just this purpose—when you want to sort 
        * the same thing in more than one way
        * java.util.Collections :
        * sort(List): Sorts the specified list into ascending order, according to the natural ordering of its elements.
        * sort(List, Comparator): Sorts the specified list according to the order induced by the specified Comparator
        * 
        * java.util.List :
        * sort(Comparator): Sorts this list according to the order induced by the specified Comparator.
        */
        
        
    }
}
