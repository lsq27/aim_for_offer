package 字节跳动.万万没想到之抓捕孔连顺;

class Solution {
    int solve(int n, int d, int[] pos) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            for (; j < n; j++) {
                if (pos[j] > pos[i] + d)
                    break;
            }
            count += (j - 1 - i) * (j - 1 - i - 1) / 2;
        }
        return count;
    }

    //二分查找
    int solve2(int n, int d, int[] pos) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int left = i, right = n - 1, mid;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (pos[mid] == pos[i] + d) {
                    right = mid;//最后用的是right的值，不是mid
                    break;
                }
                if (pos[mid] < pos[i] + d)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            count += (right - i) * (right - i - 1) / 2;
        }
        return count;
    }
}
