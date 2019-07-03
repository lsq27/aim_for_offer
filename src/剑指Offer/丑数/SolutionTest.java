package 剑指Offer.丑数;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(12, solution.GetUglyNumber_Solution(10));
    }
}