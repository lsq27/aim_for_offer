package 剑指Offer.把数组排成最小的数;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void printMinNumber() {
        int[] ints = {3, 321, 32};
        assertEquals("321323", new Solution().PrintMinNumber(ints));
    }
}