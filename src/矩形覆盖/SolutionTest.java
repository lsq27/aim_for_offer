package 矩形覆盖;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(1, solution.RectCover(1));
        assertEquals(3, solution.RectCover(3));
    }
}