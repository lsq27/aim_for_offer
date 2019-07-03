package 剑指Offer.数组中的逆序对;

import java.util.Arrays;

public class Solution {
    public int InversePairs(int[] array) {
        Arrays.copyOfRange(array, 0, array.length / 2);
        Arrays.copyOfRange(array, array.length / 2, array.length);
        return 0;
    }
}
