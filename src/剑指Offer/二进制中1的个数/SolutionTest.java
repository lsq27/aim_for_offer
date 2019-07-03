package 剑指Offer.二进制中1的个数;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(30, solution.NumberOf1(-7));
    }
}