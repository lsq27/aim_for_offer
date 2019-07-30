package 剑指Offer.孩子们的游戏;

public class Solution {
    //每回合去掉一个人，n-1人得到的结果+m，如果超出n取余
    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0)
            return -1;
        if (n == 1)
            return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }
}
