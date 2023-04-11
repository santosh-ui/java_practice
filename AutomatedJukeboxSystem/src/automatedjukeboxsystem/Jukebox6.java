/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatedjukeboxsystem;

import java.util.List;
/**
 *
 * @author Santosh
 */
public class Jukebox6 {
    public static void main(String[] args) {
        Jukebox6.go();
    }
    
    public static void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);
        
        // SAM (Single Abstract Method) interface or Functional interface
        /**
         * If an interface has only one method that needs to be implemented, that 
         * interface can be implemented as a lambda expression. You don’t need 
         * to create a whole class to implement the interface; 
         * the compiler knows what the class and method 
         * would look like. What the compiler does not know 
         * is the logic that goes inside that method
         */
        
        // sorts the list using lambda expressions
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);
        
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);
        
        songList.sort((one, two) -> one.getBpm() - two.getBpm());
        System.out.println(songList);
        
        // sort the title in descending order
        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
        System.out.println(songList);
    }
}
