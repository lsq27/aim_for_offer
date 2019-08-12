package 输入输出练习;

import java.util.Scanner;

public class Adder {
    private static String add(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int point1 = num1.length(), point2 = num2.length();
        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == '.')
                point1 = i;
        }
        for (int i = 0; i < num2.length(); i++) {
            if (num2.charAt(i) == '.')
                point2 = i;
        }
        if (num1.length() - 1 - point1 >= num2.length() - 1 - point2)
            for (int i = 0; i < num1.length() - point1 - num2.length() + point2; i++) {
                num2 += '0';
            }
        else {
            for (int i = 0; i < num2.length() - point2 - num1.length() + point1; i++) {
                num1 += '0';
            }
        }
        int point1_ = num1.length(), point2_ = num2.length();
        int flag = 0;
        while (point1_ > 0 || point2_ > 0 || flag == 1) {
            point1_--;
            point2_--;
            if (point1_ >= 0 && num1.charAt(point1_) == '.') {
                stringBuilder.append('.');
                continue;
            }
            int a = point1_ < 0 ? 0 : (num1.charAt(point1_) - '0');
            int b = point2_ < 0 ? 0 : (num2.charAt(point2_) - '0');
            stringBuilder.append((a + b + flag) % 10);
            flag = (a + b + flag) / 10;
        }
        return stringBuilder.reverse().toString();
    }

    // please don't modify any code below.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String sum = add(num1, num2);
        System.out.println(sum);
    }
}
