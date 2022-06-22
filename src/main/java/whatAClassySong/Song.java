package whatAClassySong;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Song {
    private final String title;
    private final String artist;

    private HashSet<String> listened = new HashSet<>();

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

    public int howMany(ArrayList<String> list) {
        int actualLength = listened.size();
        list.forEach(name -> listened.add(name.toLowerCase()));
        return listened.size() - actualLength;
    }

}
