package 经典算法.KMP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        int[] A = {1, 2, 3, 4, 5};
        assertArrayEquals(A, solution.calNext("abcabc"));
    }
}