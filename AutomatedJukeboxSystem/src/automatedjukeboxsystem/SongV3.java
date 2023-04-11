/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatedjukeboxsystem;

/**
 *
 * @author Santosh
 */
public class SongV3 implements Comparable<SongV3> {
    private String title;
    private String artist;
    private int bpm;
    
    @Override
    public int hashCode() {
        return title.hashCode();
    }
    
    @Override
    public boolean equals(Object aSong) {
        SongV3 s = (SongV3) aSong;
        return title.equals(s.getTitle());
    }
    
    @Override
    public int compareTo(SongV3 s) {
        return title.compareTo(s.getTitle());
    }
    
    public SongV3(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public int getBpm() {
        return bpm;
    }
    
    @Override
    public String toString() {
        return title + " : " + artist;
    }
}
