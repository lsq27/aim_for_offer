package 剑指Offer.构建乘积数组;

import java.util.ArrayList;

public class Solution {
    public int[] multiply(int[] A) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        left.add(1);
        for (int i = 0; i < A.length - 1; i++) {
            left.add(left.get(i) * A[i]);
        }
        right.add(1);
        for (int i = A.length - 1; i > 0; i--) {
            right.add(right.get(A.length - 1 - i) * A[i]);
        }
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = left.get(i) * right.get(A.length - 1 - i);
        }
        return B;
    }
}
