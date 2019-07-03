package 剑指Offer.丑数;

public class Solution {
    //时间复杂度O(n)，空间复杂度O(1)
    public int GetUglyNumber_Solution(int index) {
        if (index == 0)
            return 0;
        int[] res = new int[index];
        res[0] = 1;
        int i1 = 0, i2 = 0, i3 = 0;
        for (int i = 1; i < index; i++) {
            res[i] = Math.min(Math.min(res[i1] * 2, res[i2] * 3), res[i3] * 5);
            if (res[i] == res[i1] * 2) i1++;
            if (res[i] == res[i2] * 3) i2++;
            if (res[i] == res[i3] * 5) i3++;
        }
        return res[index - 1];
    }
}
