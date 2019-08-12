package 经典算法.背包.多重背包;

//多重背包：有N种物品和一个容量为V的背包。第i种物品最多有n[i]件可用，
//每件费用是c[i]，价值是w[i]。求解将哪些物品装入背包可使这些物品的
//费用总和不超过背包容量，且价值总和最大。

public class Solution {
    static int sum;
    static int[] result;

    public static int solve(int[] _v, int[] _w, int[] num, int C) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        int[] v = new int[sum];
        int[] w = new int[sum];
        int idx = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i]; j++) {
                v[idx] = _v[i];
                w[idx] = _w[i];
                idx++;
            }
        }

        //矩阵n+1行是因为计算第一个装不装的时候需要上一行的数据
        int[][] matrix = new int[v.length + 1][C + 1];
        for (int i = 1; i < v.length + 1; i++) {
            for (int j = 1; j < C + 1; j++) {
                if (j < w[i - 1])
                    //装不下，不装第i个
                    matrix[i][j] = matrix[i - 1][j];
                else
                    //装不装第i哪个收益大取哪个
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i - 1][j - w[i - 1]] + v[i - 1]);
            }
        }
        sum = matrix[v.length][C];
        int j = C;
        result = new int[v.length];
        for (int i = v.length; i > 0; i--) {
            if (matrix[i][j] != matrix[i - 1][j]) {
                result[i - 1] = 1;
                j = j - w[i - 1];
            }
        }
        return sum;
    }
}
