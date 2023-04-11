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
public class Jukebox5 {
    public static void main(String[] args) {
        Jukebox5.go();
    }
    
    public static void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);
        
        //sorting the songs only using Comparators instead of Comparable
        // the compiler cares not a whit what you call the class
        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);
        System.out.println(songList);
        
        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        // compiler can figure out the two objects have to be song objects
        // since songList is a List of Song objects
        System.out.println(songList);
        
        // Enter lambdas! leveraging what compiler can infer.
    }
}
