package killerGarageDoor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoorTest {
    @Test
    public void testNormalOperation() {
        test("..........", "0000000000");
        test( "P..", "123");
        test( "P....", "12345");
    }

    @Test
    public void testPause() {
        test( "P.P..", "12222");
    }

    @Test
    public void testObstacles() {
        test("P.O....", "1210000");
    }

    @Test
    public void testExample() {
        test( "..P...O.....", "001234321000");
    }

    private void test(String events,String result) {
        assertEquals(result,Door.run(events));
    }
}