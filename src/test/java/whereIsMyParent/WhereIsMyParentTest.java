package whereIsMyParent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhereIsMyParentTest {
    private static void test(final String expected, final String input) {
        assertEquals(expected, WhereIsMyParent.findChildren(input));
    }

    @Test
    public void basicTests() {
        test("AaBb", "abBA");
        test("AaaaaaZzzz", "AaaaaZazzz");
        test("AaBbbCcc", "CbcBcbaA");
        test("FfUuuuXx", "xXfuUuuF");
        test("", "");
    }
}