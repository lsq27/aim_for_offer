package 经典算法.背包.完全背包;

//完全背包：有N种物品和一个容量为V的背包，每种物品都有无限件可用。
//第i种物品的费用是c[i]，价值是w[i]。求解将哪些物品装入背包可使
//这些物品的费用总和不超过背包容量，且价值总和最大。
public class Solution {
    //动态规划，时间复杂度O(C*n)，空间复杂度O(C)
    public static int solve(int[] v, int[] w, int C) {
        int[] f = new int[C + 1];
        for (int i = 0; i < v.length; i++) {
            for (int j = w[i]; j <= C; j++)
                f[j] = Math.max(f[j], f[j - w[i]] + v[i]);
        }
        return f[C];
    }
}
