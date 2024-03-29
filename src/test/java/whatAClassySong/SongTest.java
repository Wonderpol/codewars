package whatAClassySong;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {
    Song song = new Song("Mount Moose", "The Snazzy Moose");
    @Test
    public void TestForTitleAndArtist() {
        assertEquals( "Mount Moose", song.getTitle());
        assertEquals("The Snazzy Moose", song.getArtist());
    }

    @Test
    public void testForDataEncapsulation() {
        assertEquals(0, song.getClass().getFields().length);
    }

    @Test
    public void TestHowManyMethod() {
        assertEquals(5, song.howMany(new ArrayList<String>(Arrays.asList("John", "Fred", "Bob", "Carl", "RyAn"))));
        assertEquals(3, song.howMany(new ArrayList<String>(Arrays.asList("JoHn", "Luke", "AmAndA"))));
        assertEquals(4, song.howMany(new ArrayList<String>(Arrays.asList("Amanda", "CalEb", "CarL", "Furgus"))));
        assertEquals(6, song.howMany(new ArrayList<String>(Arrays.asList("JOHN", "FRED", "BOB", "CARL", "RYAN", "KATE"))));
        assertEquals(2, song.howMany(new ArrayList<String>(Arrays.asList("Jack", "jacK"))));
    }
}