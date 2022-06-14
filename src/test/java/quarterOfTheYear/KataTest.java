package quarterOfTheYear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void shouldReturnFirstQuarter() {
        assertEquals(1, Kata.quarterOf(2));
    }
    @Test
    public void shouldReturnSecondQuarter() {
        assertEquals(2, Kata.quarterOf(4));
    }

    @Test
    public void shouldReturnThirdQuarter() {
        assertEquals(3, Kata.quarterOf(8));
    }

    @Test
    public void shouldReturnFourthQuarter() {
        assertEquals(4, Kata.quarterOf(11));
    }
}