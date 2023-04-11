/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatedjukeboxsystem;

/**
 *
 * @author Santosh
 */
public class SongV2 implements Comparable<SongV2>{
    private String title;
    private String artist;
    private int bpm;
    
    public SongV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }
    
    @Override
    public int compareTo(SongV2 s) {
        return title.compareTo(s.getTitle());
    }
    
    
    
    /**
     * 
     * @return 
     */
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public int getBpm() {
        return bpm;
    }
    
    /**
     * since the toString() method is called on an object when it’s printed 
     * (System.out.println(anObject)), 
     * you should override it to print something more readable 
     * than the default unique identifier code
     */
    @Override
    public String toString() {
        return title;
    }
}
