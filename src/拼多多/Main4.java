package 拼多多;

import java.util.Scanner;

public class Main4 {
    public static int[] X, Y;
    public static boolean[] r;
    public static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        X = new int[m];
        Y = new int[m];
        for (int i = 0; i < m; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        r = new boolean[n];

        //第一次上山
        for (int i = 0; i < n; i++) {
            r[i] = true;
            solve(i, 1);
            r[i] = false;
        }
    }

    public static void solve(int t, int step) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (r[i]) count++;
        }
        if (count == n)
            return;

        boolean f = false;
        for (int i = 0; i < m; i++) {
            //从山顶到没去过的
            if (X[i] == t && !r[Y[i]]) {
                f = true;
            }
        }
        if (!f)
            return;

        for (int i = 0; i < m; i++) {
            //从山顶到没去过的
            if (X[i] == t && !r[Y[i]]) {
                r[Y[i]] = true;
                solve(Y[i], step);
                r[Y[i]] = false;
            }
        }
    }
}
