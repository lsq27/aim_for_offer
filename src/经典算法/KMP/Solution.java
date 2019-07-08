package 经典算法.KMP;

public class Solution {
    public int[] solve(String str, String ptr) {
        int[] index = new int[]{};
        //calNext();
        return index;
    }

    int[] calNext(String ptr) {
        int[] next = new int[ptr.length()];
        int i = 1, j = 0, index = 0;
        while (i < ptr.length()) {
            if (ptr.charAt(i - index) == ptr.charAt(j)) {
                next[i]++;
                index++;
                j++;
            } else {
                i++;
                index = 0;
                j = 0;
            }
        }
        return next;
    }
}
