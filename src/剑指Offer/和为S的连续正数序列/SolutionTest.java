package 剑指Offer.和为S的连续正数序列;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> expectedArray = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(2);
        arrayList1.add(3);
        expectedArray.add(arrayList1);
        assertEquals(expectedArray, solution.FindContinuousSequence(5));
    }
}