package 和为S的两个数字;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0, j = array.length - 1; i < j; ) {
            int temp = array[i] + array[j];
            if (temp == sum) {
                result.add(array[i]);
                result.add(array[j]);
                break;
            } else if (temp < sum) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
