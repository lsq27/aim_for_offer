package 经典算法.背包01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        int[] v = {6, 3, 5, 4, 6};
        int[] w = {2, 2, 6, 5, 4};
        int C = 10;
        solution.solve1(v, w, C);
        assertEquals(15, solution.sum);
        assertArrayEquals(new int[]{1, 1, 0, 0, 1}, solution.result);
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        int[] v = {6, 3, 5, 4, 6};
        int[] w = {2, 2, 6, 5, 4};
        int C = 10;
        solution.solve2(v, w, C);
        assertEquals(15, solution.sum);
        assertArrayEquals(new int[]{1, 1, 0, 0, 1}, solution.result);
    }

    @Test
    void test3() {
        Solution solution = new Solution();
        int[] v = {6, 3, 5, 4, 6};
        int[] w = {2, 2, 6, 5, 4};
        int C = 10;
        solution.solve3(v, w, C);
        assertEquals(15, solution.sum);
        assertArrayEquals(new int[]{1, 1, 0, 0, 1}, solution.result);
    }
}