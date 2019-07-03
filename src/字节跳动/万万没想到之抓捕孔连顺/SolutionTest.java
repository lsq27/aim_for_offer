package 字节跳动.万万没想到之抓捕孔连顺;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        int[] pos = {1, 2, 3, 4};
        assertEquals(4, solution.solve(4, 3, pos));
        assertEquals(4, solution.solve2(4, 3, pos));
        int[] pos2 = {1, 10, 20, 30, 50};
        assertEquals(1, solution.solve(5, 19, pos2));
        assertEquals(1, solution.solve2(5, 19, pos2));
    }
}