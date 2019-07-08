package 华为.整数反转求和;

public class Solution {
    public int reverseAdd(int a, int b) {
        return reverse(a) + reverse(b);
    }

    private int reverse(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum * 10 + num % 10;
            num /= 10;
        }
        return sum;
    }
}
