package 变态跳台阶;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(4, solution.JumpFloorII(3));
    }
}