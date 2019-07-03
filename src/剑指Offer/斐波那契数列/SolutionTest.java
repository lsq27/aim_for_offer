package 剑指Offer.斐波那契数列;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(0, solution.Fibonacci(0));
        assertEquals(0, solution.Fibonacci2(0));
        assertEquals(0, solution.Fibonacci3(0));
        assertEquals(1, solution.Fibonacci(1));
        assertEquals(1, solution.Fibonacci2(1));
        assertEquals(1, solution.Fibonacci3(1));
        assertEquals(5, solution.Fibonacci(5));
        assertEquals(5, solution.Fibonacci2(5));
        assertEquals(5, solution.Fibonacci3(5));
    }
}