package 剑指Offer.数组中的逆序对;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void inversePairs() {
        Solution solution = new Solution();
        assertEquals(7, solution.InversePairs(new int[]{1, 2, 3, 4, 5, 6, 7, 0}));
    }
}