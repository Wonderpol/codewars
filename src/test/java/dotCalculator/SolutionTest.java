package dotCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void exampleTest() {
        assertEquals(".....", Solution.calc("..... // ."));
        assertEquals("..........", Solution.calc("..... * .."));
        assertEquals("..", Solution.calc("..... // .."));
        assertEquals("....", Solution.calc("..... - ."));
        assertEquals("....................", Solution.calc("..... + ..............."));
        assertEquals("...............", Solution.calc("..... * ..."));
        assertEquals("..", Solution.calc("..... - ..."));
        assertEquals("", Solution.calc(". - ."));
        assertEquals("", Solution.calc(". // .."));
    }
}