package 把数组排成最小的数;

public class Solution {
    public String PrintMinNumber(int[] numbers) {
        int index = -1, max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] / Math.pow(10, (int) Math.log10(numbers[i])) > max) {
            }
        }
        return null;
    }
}
