package 包含min函数的栈;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        solution.push(3);
        assertEquals(3, solution.min());
        solution.push(4);
        assertEquals(3, solution.min());
    }
}