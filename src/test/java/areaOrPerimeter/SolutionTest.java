package areaOrPerimeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(16, Solution.areaOrPerimeter(4 , 4));
        assertEquals(32, Solution.areaOrPerimeter(6 , 10));
    }
}