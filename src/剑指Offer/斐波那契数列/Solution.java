package 剑指Offer.斐波那契数列;

public class Solution {
    //递归产生大量重复计算，时间复杂度O(2^n)，空间复杂度O(n)
    public int Fibonacci(int n) {
        //递归终止条件
        if (n == 0 || n == 1) {
            return n;
        }
        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }

    //利用尾递归，时间复杂度O(n)，空间复杂度O(n)
    public int Fibonacci2(int n) {
        return Fibonacci2Helper(0, 1, n);
    }

    int Fibonacci2Helper(int first, int second, int n) {
        if (n == 0)
            return first;
        return Fibonacci2Helper(second, first + second, n - 1);
    }

    //将递归转换为循环，时间复杂度O(n)，空间复杂度O(1)
    public int Fibonacci3(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 1; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
