package 剑指Offer.数组中的逆序对;

public class Solution {
    int count;

    //归并排序
    public int InversePairs(int[] array) {
        help(array, 0, array.length);
        return count % 1000000007;
    }

    public void help(int[] array, int start, int end) {
        if (end - start == 1)
            return;
        help(array, start, start + (end - start) / 2);
        help(array, start + (end - start) / 2, end);
        merge(array, start, end);
    }

    public void merge(int[] array, int start, int end) {
        int mid = start + (end - start) / 2;
        int[] result = new int[end - start];
        int idx = 0;
        for (int i = start, j = mid; i < mid || j < end; idx++) {
            if (i == mid) {
                result[idx] = array[j++];
                continue;
            }
            if (j == end) {
                result[idx] = array[i++];
                continue;
            }
            if (array[i] > array[j]) {
                result[idx] = array[j++];
                count += mid - i;
                if (count >= 1000000007)
                    count %= 1000000007;
            } else {
                result[idx] = array[i++];
            }
        }
        for (int i = 0; i < result.length; i++) {
            array[start + i] = result[i];
        }
    }
}
