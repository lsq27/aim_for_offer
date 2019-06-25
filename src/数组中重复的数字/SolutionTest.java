package 数组中重复的数字;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 3};
        int[] duplication = {0};
        if (solution.duplicate(numbers, 5, duplication))
            assertArrayEquals(new int[]{3}, duplication);
        if (solution.duplicate2(numbers, 5, duplication))
            assertArrayEquals(new int[]{3}, duplication);
    }
}