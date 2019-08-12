package 经典算法.背包.背包01;

public class Solution {
    int sum;
    int[] result;

    //回溯法，时间复杂度O(2^n)，空间复杂度O(n)
    public void solve1(int[] v, int[] w, int C) {
        int[] result = new int[v.length];
        solve1Helper(v, w, C, 0, 0, result);
    }

    //参数也可以只用index，其余使用实例成员变量，回溯的时候C和sum反向运算,会抵消掉已经装入的物品
    public void solve1Helper(int[] v, int[] w, int C, int sum, int index, int[] result) {
        if (index == v.length) {
            if (sum > this.sum) {
                this.sum = sum;
                this.result = result.clone();
            }
            return;
        }
        if (C >= w[index]) {
            //装进去index
            result[index] = 1;
            solve1Helper(v, w, C - w[index], sum + v[index], index + 1, result);
        }
        //不装进去index
        result[index] = 0;
        solve1Helper(v, w, C, sum, index + 1, result);
    }

    //动态规划，时间复杂度O(C*n)，空间复杂度O(C*n)
    public void solve2(int[] v, int[] w, int C) {
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
    }

    //贪心算法，物品可以装一部分
    public double solve3(int[] v, int[] w, int C) {
        int n = v.length;
        double value = 0;
        double[] r = new double[n];
        boolean[] s = new boolean[n];
        for (int i = 0; i < v.length; i++) {
            r[i] = (double) v[i] / w[i];
            s[i] = true;
        }

        while (C > 0) {
            double temp = 0;
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (s[i] && r[i] > temp) {
                    temp = r[i];
                    index = i;
                }
            }
            s[index] = false;
            if (C >= w[index]) {
                C -= w[index];
                value += v[index];
            } else {
                value += C * r[index];
                w[index] = C;
                C = 0;
            }
        }
        return value;
    }
}
