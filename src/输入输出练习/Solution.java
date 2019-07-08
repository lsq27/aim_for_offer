package 输入输出练习;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution {
    private int a;

    public static void main(String[] args) {
        double f = 0.5;
        Object o = "蛤".getBytes();
        System.out.println('蛤');
        Solution solution = new Solution();
        solution.a();
        Scanner scanner = new Scanner(System.in);
        Integer a = 1;
        String str = new String("蛤".getBytes(), StandardCharsets.UTF_8);
        ok:
        while (true) {
            System.out.println(scanner.nextInt());
            break ok;
        }
    }

    void a() {
        Solution solution = new Solution();
        System.out.println(solution.a);
    }
}
