/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatedjukeboxsystem;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author Santosh
 */
public class Jukebox8 {
    public static void main(String[] args) {
        Jukebox8.go();
    }
    
    public static void go() {
        List<SongV2> songList = MockMoreSongs.getSongsV3();
        System.out.println(songList);
        
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);
        
        Set<SongV2> songSet = new HashSet<SongV2>(songList);
        // HashSet has a constructor that take a collection and 
        // it will create a set with all the items from that collection
        System.out.println(songSet);
        
        // set did not help, the list still has duplicates.
    }
}
