package 剑指Offer.不用加减乘除做加法;

public class Solution {
    //时间复杂度O(log2(max(num1,num2)))，空间复杂度O(1)
    public int Add(int num1, int num2) {
        while (num1 != 0) {
            int t = num1;
            //进位
            num1 = (t & num2) << 1;
            //剩余部分
            num2 = t ^ num2;
        }
        return num2;
    }
}
