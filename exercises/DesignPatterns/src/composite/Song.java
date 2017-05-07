package composite;

import java.util.Iterator;

/**
 * Created by thomasmcgarry on 01/05/2017.
 */
public class Song extends SongComponent{

    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSongname, String newBandName, int newYearReleased) {
        songName = newSongname;
        bandName = newBandName;
        releaseYear = newYearReleased;
    }



    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void displaySongInfo(){
        System.out.println(getSongName() + " was recorded by " + getBandName()
            + " in " + getReleaseYear());
    }

}
