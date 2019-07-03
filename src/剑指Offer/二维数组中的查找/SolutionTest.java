package 剑指Offer.二维数组中的查找;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void addition() {
        int target = 5;
        int[][] array = {{2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(solution.Find(target, array));
        target = 1;
        assertFalse(solution.Find(target, array));
    }
}