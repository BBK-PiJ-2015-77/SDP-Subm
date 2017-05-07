package composite;

/**
 * Created by thomasmcgarry on 01/05/2017.
 */
public abstract class SongComponent {

    public void add(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    public int getReleaseYear() {
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }

}
