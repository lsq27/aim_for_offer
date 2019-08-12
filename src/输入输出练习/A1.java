package 输入输出练习;

import java.util.HashSet;

public class A1 {
    public static void main(String[] args) {
        int n = 5, m = 2;
        int[] a = {1, 2, 3, 4, 5}, c = {1, 2, 3, 4, 2};
        String[] b = {"hello", "hello", "world", "hello", "hello"};
        boolean[] d = {true, false, true, false, true};
        HashSet<Integer> hashSet = new HashSet<>();

        int a_delta = 1, c_x = 3;
        for (int i = 0; i < n; i++) {
            if (c[i] == c_x) {
                for (int j = 0; j < n; j++) {
                    if (c[j] != c[i] && Math.abs(a[i] - a[j]) <= a_delta
                            && b[i].equals(b[j]) && (d[i] != d[j])) {
                        hashSet.add(c[j]);
                    }
                }
            }
        }
        System.out.println(hashSet.size());
    }
}
