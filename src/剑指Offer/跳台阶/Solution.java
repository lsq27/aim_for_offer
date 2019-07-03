package 剑指Offer.跳台阶;

public class Solution {
    //见斐波那契数列
    public int JumpFloor(int target) {
        if (target == 1 || target == 2) {
            return target;
        } else {
            int a = 1;
            int b = 2;
            int c = 0;
            for (int i = 2; i < target; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
