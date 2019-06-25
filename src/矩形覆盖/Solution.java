package 矩形覆盖;

public class Solution {
    //见斐波那契数列
    public int RectCover(int target) {
        if (target == 0)
            return 0;
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 1; i < target; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
