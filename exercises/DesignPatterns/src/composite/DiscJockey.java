package composite;

/**
 * Created by thomasmcgarry on 01/05/2017.
 */
public class DiscJockey {

    SongComponent songList;

    public DiscJockey(SongComponent newSongList) {
        songList = newSongList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }

}
