package 剑指Offer.构建乘积数组;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {120, 60, 40, 30, 24};
        assertArrayEquals(B, solution.multiply(A));
    }
}