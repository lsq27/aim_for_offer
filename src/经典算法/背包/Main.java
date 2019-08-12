package 经典算法.背包;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        int result = A.length;
        for (int k = 0; k < A.length; k++) {
            int tmp = solve(A, 0, k, true)
                    + solve(A, k + 1, A.length, false);
            //array.length - tmp为需要改变的元素个数
            result = Math.min(A.length - tmp, result);
        }
        System.out.println(result);
    }

    //求解向量A[begin,end)的最长子序列长度，flag==true时求上升子序列
    //flag==false时求下降子序列
    public static int solve(int[] A, int begin, int end, boolean flag) {
        if (begin == end)
            return 0;
        //B保存子问题结果,最长上升子序列长度最短为1，所以赋初值为1
        int[] B = new int[end - begin];
        for (int i = 0; i < B.length; i++)
            B[i] = 1;
        //状态转移方程 B[i] = max{B[j] + 1,B[i]} (0 <= j < i, A[i] >= A[j])
        for (int i = begin; i < end; i++) {
            for (int j = begin; j < i; j++) {
                if (flag) {
                    if (A[i] > A[j])
                        B[i - begin] = Math.max(B[j - begin] + 1, B[i - begin]);
                } else {
                    if (A[i] < A[j])
                        B[i - begin] = Math.max(B[j - begin] + 1, B[i - begin]);
                }
            }
        }
        //求B中的最大元素
        int max = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] > max)
                max = B[i];
        }
        return max;
    }
}
