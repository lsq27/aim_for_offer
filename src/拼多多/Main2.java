package 拼多多;

import java.util.Arrays;
import java.util.Scanner;

//长为L的项链，上面有n个珍珠，将珍珠移动到一起，
//1000 4 1 4 998 995 -> 8
//10 5 1 3 5 7 9 -> 6
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        int[] B = new int[n];
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            if (i == n - 1)
                B[i] = A[0] + l - A[i];
            else
                B[i] = A[i + 1] - A[i];
        }

        int r = Integer.MAX_VALUE;
        for (int t = 0; t < l; t++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] > t)
                    sum += Math.min(A[i] - t, t + l - A[i]);
                else
                    sum += Math.min(t - A[i], A[i] + l - t);
            }
            if (sum < r)
                r = sum;
        }

        for (int i = 1; i < n; i++) {
            r -= (i + 1) / 2;
        }
        System.out.println(r);
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        int[] B = new int[n];
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            if (i == n - 1)
                B[i] = A[0] + l - A[i];
            else
                B[i] = A[i + 1] - A[i];
        }
        Arrays.sort(B);
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            r += B[i] - 1;
        }
        System.out.println(r);
    }
}
