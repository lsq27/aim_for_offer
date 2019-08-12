package 输入输出练习;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {


    public static int BinarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == arr[mid]) {
                return mid;
            }
            if (value > arr[mid]) {
                low = mid + 1;
            }
            if (value < arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        int q = sc.nextInt();
        int[] B = new int[q];
        for (int i = 0; i < q; i++)
            B[i] = sc.nextInt();

        for (int i = 0; i < B.length; i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[B[i] - 1] >= A[j])
                    sum++;
            }
            System.out.printf("%.6f\n", (double) (sum - 1) / n * 100);
        }
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();
            solve(A);
        }
    }

    public static void solve(int[] A) {
        Arrays.sort(A);
        if (A.length == 3 && A[1] >= A[0] + A[2]) {
            System.out.println("NO");
            return;
        }
        if (A.length >= 3 && A[0] >= A[1] + A[2]) {
            System.out.println("NO");
            return;
        }
        if (A.length >= 4 && A[1] >= A[0] + A[3]) {
            System.out.println("NO");
            return;
        }
        if (A.length >= 4 && A[A.length - 2] >= A[A.length - 4] + A[A.length - 1]) {
            System.out.println("NO");
            return;
        }
        if (A.length >= 3 && A[A.length - 1] >= A[A.length - 3] + A[A.length - 2]) {
            System.out.println("NO");
            return;
        }
        for (int i = 2; i < A.length - 2; i++) {
            if (A[i] >= A[i - 2] + A[i + 2]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        int[] B = new int[q];
        for (int i = 0; i < q; i++)
            B[i] = sc.nextInt();

        Arrays.sort(A);

        for (int i = 0; i < B.length; i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] >= B[i]) {
                    A[j]--;
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 2; j++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int x = sc.nextInt();
            double[] A = new double[n];
            for (int i = 0; i < n; i++)
                A[i] = sc.nextDouble();
            sool(A, a, x);
        }
    }

    public static void sool(double[] A, int a, int x) {
        Arrays.sort(A);
        double count = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            //加速干完活
            double tmp = A[i] / a;
            if (count + tmp <= 60 * x)
                count += tmp;
                //完全不加速
            else if (count >= 60 * x) {
                count += A[i];
                //加速干完活得一部分
            } else
                count = A[i] - a * (60 * x - count) + 60 * x;
        }
        int time = (int) Math.ceil(count);
        if (time >= 60 * 8)
            System.out.println(0);
        else
            System.out.printf("%d\n", time);
    }
}