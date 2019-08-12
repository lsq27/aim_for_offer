package 剑指Offer.数组中重复的数字;

import java.util.HashSet;

public class Solution {
    //利用HashSet的元素不可重复特性,时间复杂度O(n),空间复杂度O(n)
    public boolean duplicate(int[] numbers, int length, int[] duplication) {
        HashSet<Integer> set = new HashSet<>();
        if (length == 0)
            return false;
        for (int t : numbers) {
            if (!set.add(t)) {
                duplication[0] = t;
                return true;
            }
        }
        return false;
    }

    //利用输入数组对出现的数做标记（numbers[t]>=length说明t出现过），时间复杂度O(n),空间复杂度O(1)
    public boolean duplicate2(int[] numbers, int length, int[] duplication) {
        if (length == 0)
            return false;
        for (int t : numbers) {
            //防止numbers索引超出范围
            if (t >= length) t -= length;
            if (numbers[t] < length)
                //t第一次出现
                numbers[t] += length;
            else {
                //t第二次出现
                duplication[0] = t;
                return true;
            }
        }
        return false;
    }
}
