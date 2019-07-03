package 剑指Offer.和为S的连续正数序列;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = sum - 1; i > 1; i--) {
            if ((i & 1) == 1 && sum % i == 0) {
                int mid = sum / i;
                int first = mid - (i - 1) / 2;
                int last = mid + (i - 1) / 2;
                if (first < 1)
                    continue;
                else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    for (int j = first; j < last + 1; j++) {
                        temp.add(j);
                    }
                    result.add(temp);
                }
            } else if ((i & 1) == 0 && (double) (sum % i) / i == 0.5) {
                int mid = sum / i;
                int first = mid - i / 2 + 1;
                int last = mid + i / 2;
                if (first < 1)
                    continue;
                else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    for (int j = first; j < last + 1; j++) {
                        temp.add(j);
                    }
                    result.add(temp);
                }
            }
        }
        return result;
    }
}
