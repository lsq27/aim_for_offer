package 输入输出练习;

import java.util.Scanner;

public class Main {
    private static String process(String num1, String num2) {
        String[] strings = num1.split(" ");
        int[] coins = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            coins[i] = Integer.valueOf(strings[i]);
        }
        int[] dp = new int[100001];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= Integer.valueOf(num2); j++) {
                dp[j] = (dp[j] + dp[j - coins[i]]) % 1000000007;
            }
        }

        return String.valueOf(dp[Integer.valueOf(num2)]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strValueSequences = sc.nextLine();
        String strChargeNum = sc.nextLine();

        String sum = process(strValueSequences, strChargeNum);
        System.out.println(sum);
    }
}
