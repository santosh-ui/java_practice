/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatedjukeboxsystem;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
/**
 *
 * @author Santosh
 */
public class Jukebox9 {
    
    public static void main(String[] args) {
        Jukebox9.go();
    }
    
    public static void go() {
        List<SongV3> songList  = MockMoreSongs.getSongsV4();
        System.out.println(songList);
        
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);
        
        Set<SongV3> songSet = new HashSet<>(songList);
        System.out.println(songSet);
        
        // Create a TreeSet instead of HashSet. The 
        // TreeSet will use SongV4’s compareTo() 
        // method to sort the items in songList
        Set<SongV3> songTreeSet = new TreeSet<>(songList);
        System.out.println(songTreeSet);
        
        // this one uses comparator to sort the set
        // Remember, lambda uses comparator
        Set<SongV3> songTree2 = new TreeSet<>((one, two) -> one.getBpm() - two.getBpm());
        songTree2.addAll(songList);
        System.out.println(songTree2);
        
    }
}
