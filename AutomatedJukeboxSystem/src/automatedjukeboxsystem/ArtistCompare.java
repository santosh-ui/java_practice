/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatedjukeboxsystem;

import java.util.Comparator;
/**
 *
 * @author Santosh
 */
public class ArtistCompare implements Comparator<SongV2>{
    /**
     * compares one song to another by artist
     * @param one
     * @param two
     * @return 
     */
    @Override
    public int compare(SongV2 one, SongV2 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}
