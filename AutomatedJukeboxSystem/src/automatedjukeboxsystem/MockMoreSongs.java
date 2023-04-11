/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatedjukeboxsystem;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Santosh
 */
public class MockMoreSongs {
    public static List<SongV2> getSongsV3() {
        List<SongV2> songList = new ArrayList<>();
        songList.add(new SongV2("somersault", "zero 7", 147));
        songList.add(new SongV2("cassidy", "grateful dead", 158));
        songList.add(new SongV2("$10", "hitchhiker", 140));
        songList.add(new SongV2("havana", "cabello", 105));
        songList.add(new SongV2("$10", "hitchhiker", 140));
        songList.add(new SongV2("cassidy", "grateful dead", 158));
        songList.add(new SongV2("50 ways", "simon", 102));
        return songList;
    }
    
    public static List<SongV3> getSongsV4() {
        List<SongV3> songList = new ArrayList<>();
        songList.add(new SongV3("somersault", "zero 7", 147));
        songList.add(new SongV3("cassidy", "grateful dead", 158));
        songList.add(new SongV3("$10", "hitchhiker", 140));
        songList.add(new SongV3("havana", "cabello", 105));
        songList.add(new SongV3("$10", "hitchhiker", 140));
        songList.add(new SongV3("cassidy", "grateful dead", 158));
        songList.add(new SongV3("50 ways", "simon", 102));
        return songList;
    }
}
