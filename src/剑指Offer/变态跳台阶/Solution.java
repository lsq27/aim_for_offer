package 剑指Offer.变态跳台阶;

public class Solution {
    //f(n)=2*f(n-1)
    public int JumpFloorII(int target) {
        return 1 << (target - 1);
    }
}
