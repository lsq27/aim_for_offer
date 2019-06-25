package 左旋转字符串;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals("XYZdefabc", solution.LeftRotateString("abcXYZdef", 3));
    }
}