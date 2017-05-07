package composite;

/**
 * Created by thomasmcgarry on 01/05/2017.
 */
public class SongListGenerator {

    public static void  main(String[] args) {

        SongComponent industrialMusic = new SongGroup("Industrial","is a style of experimental music");

        SongComponent heavyMetalMusic = new SongGroup("\nHeavy Metal","is a genre of rock that developed in the late 60s");

        SongComponent dubstepMusic = new SongGroup("\nDubstep","is a genre of electronic dance music");

        SongComponent everySong = new SongGroup("Song List", "Every song available");

        everySong.add(industrialMusic);

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));
        industrialMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabbath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey crazyLarry = new DiscJockey(everySong);

        crazyLarry.getSongList();

    }

}
