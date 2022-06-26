package fourSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void exampleTests() {
        assertEquals(Kata.fourSeven(7), 4);
        assertEquals(Kata.fourSeven(4), 7);
    }
}