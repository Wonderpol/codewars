package whatAClassySong;
import java.util.ArrayList;

public class Song {
    private final String title;
    private final String artist;

    Song(final String title, final String artist) {
        this.title = title;
        this.artist = artist;
    }

    String getTitle() {
        return title;
    }

    String getArtist() {
        return artist;
    }

    //TODO: refactor this method
    public int howMany(ArrayList<?> list) {
        return list.size();
    }

}
