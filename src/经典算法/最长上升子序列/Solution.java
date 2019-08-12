package 经典算法.最长上升子序列;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] array = {10, 6, 3, 4, 3, 3, 4, 5, 5, 4, 6};
        //需要调整元素的个数，最坏情况下每个元素都需要调整
        int result = array.length;
        //以第k个元素为分界点，将序列分为两个部分
        //对第一个部分求最长下降子序列长度，对第二个部分求最长上升子序列长度
        for (int k = 0; k < array.length; k++) {
            int tmp = solve(array, 0, k, false)
                    + solve(array, k + 1, array.length, true);
            //array.length - tmp为需要改变的元素个数
            result = Math.min(array.length - tmp, result);
        }
        System.out.println(result);
    }

    //求解向量A[begin,end)的最长子序列长度，flag==true时求上升子序列
    //flag==false时求下降子序列
    public static int solve(int[] A, int begin, int end, boolean flag) {
        if (begin == end)
            return 0;
        //B保存子问题结果,最长上升子序列长度最短为1，所以赋初值为1
        int[] B = new int[end - begin];
        for (int i = 0; i < B.length; i++)
            B[i] = 1;
        //状态转移方程 B[i] = max{B[j] + 1,B[i]} (0 <= j < i, A[i] >= A[j])
        for (int i = begin; i < end; i++) {
            for (int j = begin; j < i; j++) {
                if (flag) {
                    if (A[i] >= A[j])
                        B[i - begin] = Math.max(B[j - begin] + 1, B[i - begin]);
                } else {
                    if (A[i] <= A[j])
                        B[i - begin] = Math.max(B[j - begin] + 1, B[i - begin]);
                }
            }
        }
        //求B中的最大元素
        int max = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] > max)
                max = B[i];
        }
        return max;
    }

    public static int solve2(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (!dp.contains(nums[i])) {
                if (nums[i] > dp.get(dp.size() - 1))
                    dp.add(nums[i]);
                else if (nums[i] < dp.get(dp.size() - 1)) {
                    int l = 0, r = dp.size() - 1;
                    while (l < r) {
                        int mid = l + (r - l) / 2;
                        if (dp.get(mid) < nums[i])
                            l = mid + 1;
                        else
                            r = mid;
                    }
                    dp.set(r, nums[i]);
                }
            }
        }
        return dp.size();
    }
}
