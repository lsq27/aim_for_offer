package 经典算法.背包.完全背包;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    public void solve() {
        int[] v = {6, 3, 5, 4, 6};
        int[] w = {2, 2, 6, 5, 4};
        int C = 10;
        assertEquals(30, Solution.solve(v, w, C));
    }
}
