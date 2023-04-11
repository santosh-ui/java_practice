/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatedjukeboxsystem;


import java.util.Collections;
import java.util.List;
/**
 *
 * @author Santosh
 */
public class Jukebox4 {
    public static void main(String[] args) {
        Jukebox4.go();
    }
    
    public static void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);
        Collections.sort(songList);
        // sorted using compareTo() in Comparable interface
        System.out.println(songList);
        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        // sorted using compare() in ArtistCompare class which implements Comparator interface
        System.out.println(songList);
    }
}
