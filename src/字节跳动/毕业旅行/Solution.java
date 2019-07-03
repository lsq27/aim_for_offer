package 字节跳动.毕业旅行;

public class Solution {
    public int manage(int n, int[][] m) {
        return solve(0, 0, n, m);
    }

    public int solve(int cost, int from, int n, int[][] m) {
        if (n == 1) {
            for (int i = 0; i < m.length; i++)
                for (int j = 0; j < m.length; j++)
                    cost += m[i][j];
            return cost;
        }
        for (int i = 0; i < n; i++) {

        }
        return 0;
    }
}
