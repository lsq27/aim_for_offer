package 剑指Offer.矩阵中的路径;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertFalse(solution.hasPath("abcesfcsadee".toCharArray(), 3, 4, "abcb".toCharArray()));
        assertTrue(solution.hasPath("abcesfcsadee".toCharArray(), 3, 4, "bcced".toCharArray()));
    }
}