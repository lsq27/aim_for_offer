package 剑指Offer.用两个栈实现队列;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        assertEquals(1, solution.pop());
    }
}