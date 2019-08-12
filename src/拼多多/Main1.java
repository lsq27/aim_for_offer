package 拼多多;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] A = new double[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextDouble();

        Arrays.sort(A);
        double r = Double.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            double mean = (A[i] + A[i + 1] + A[i + 2]) / 3;
            double t = (Math.pow(A[i] - mean, 2)
                    + Math.pow(A[i + 1] - mean, 2) + Math.pow(A[i + 2] - mean, 2)) / 3;
            if (r > t) {
                r = t;
            }
        }
        System.out.printf("%.2f", r);
    }
}
