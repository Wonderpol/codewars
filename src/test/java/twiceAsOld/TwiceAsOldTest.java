package twiceAsOld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwiceAsOldTest {
    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld.twiceAsOld(30,0));
        assertEquals(16, TwiceAsOld.twiceAsOld(30,7));
        assertEquals(15, TwiceAsOld.twiceAsOld(45,30));

    }
}