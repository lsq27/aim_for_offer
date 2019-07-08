package 华为.整数反转求和;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(42, solution.reverseAdd(12, 12));
        assertEquals(21, solution.reverseAdd(0, 12));
        assertEquals(11, solution.reverseAdd(5, 6));
        assertEquals(26, solution.reverseAdd(5, 12));
    }
}