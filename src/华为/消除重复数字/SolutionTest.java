package 华为.消除重复数字;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(432, solution.removeRepeatedNum(423234));
        assertEquals(540728, solution.removeRepeatedNum(45240728));
    }
}