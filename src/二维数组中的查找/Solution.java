package 二维数组中的查找;

public class Solution {
    public boolean Find(int target, int[][] array) {
        int i = 0;
        int j = array[0].length - 1;
        while (i < array.length && j >= 0) {
            if (target == array[i][j]) {
                return true;
            } else if (target > array[i][j]) {
                ++i;
            } else {
                --j;
            }
        }
        return false;
    }
}
