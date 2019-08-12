package 剑指Offer.矩阵中的路径;

import java.util.Arrays;

public class Solution {
    //回溯法，时间复杂度O(n)，空间复杂度O(n)
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] booleans = new boolean[matrix.length];
        //找到第一个字符
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == str[0])
                if (hasPathHelper(i, matrix, booleans, rows, cols, Arrays.copyOfRange(str, 1, str.length)))
                    return true;
        }
        return false;
    }

    boolean hasPathHelper(int index, char[] matrix, boolean[] booleans, int rows, int cols, char[] str) {
        booleans = booleans.clone();
        booleans[index] = true;
        if (str.length == 0)
            return true;
        //向左
        if (index % cols != 0 && !booleans[index - 1] && matrix[index - 1] == str[0])
            if (hasPathHelper(index - 1, matrix, booleans, rows, cols, Arrays.copyOfRange(str, 1, str.length)))
                return true;
        //向右
        if (index % cols != cols - 1 && !booleans[index + 1] && matrix[index + 1] == str[0])
            if (hasPathHelper(index + 1, matrix, booleans, rows, cols, Arrays.copyOfRange(str, 1, str.length)))
                return true;
        //向上
        if (index / cols != 0 && !booleans[index - cols] && matrix[index - cols] == str[0])
            if (hasPathHelper(index - cols, matrix, booleans, rows, cols, Arrays.copyOfRange(str, 1, str.length)))
                return true;
        //向下
        if (index / cols != rows - 1 && !booleans[index + cols] && matrix[index + cols] == str[0])
            return hasPathHelper(index + cols, matrix, booleans, rows, cols, Arrays.copyOfRange(str, 1, str.length));
        return false;
    }
}
