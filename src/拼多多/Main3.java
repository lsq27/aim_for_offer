package 拼多多;

import java.util.Scanner;

//输入n,s,求长度为n和为s的单调递增的数列的个数
//3 10 -> 4
//2 5 -> 2
public class Main3 {
    public static int r;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        for (int i = 1; i < s; i++) {
            solve(i, s - i, n - 1);
        }
        System.out.println(r);
    }

    //遍历所有情况
    public static void solve(int k, int s, int n) {
        if (n == 1) {
            if (k < s)
                r++;
            return;
        }
        for (int i = k + 1; i < s; i++) {
            solve(i, s - i, n - 1);
        }
    }
}
