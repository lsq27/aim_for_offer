package 剑指Offer.二叉搜索树的后序遍历序列;

import java.util.Arrays;

public class Solution {
    public boolean VerifySquenceOfBST(int[] sequence) {
        //递归终止
        if (sequence.length == 0)
            return false;
        else if (sequence.length <= 2)
            return true;

        int index = sequence.length - 1;
        for (int i = 0; i < sequence.length - 1; i++) {
            //找到左右子树的分界点
            if (sequence[i] > sequence[sequence.length - 1]) {
                index = i;
                //检查右子树是不是比根大
                for (int j = i + 1; j < sequence.length - 1; j++) {
                    if (sequence[j] < sequence[sequence.length - 1]) {
                        return false;
                    }
                }
                break;
            }
        }
        if (index >= sequence.length - 4)
            return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, sequence.length - 1));
        if (index <= 2)
            return VerifySquenceOfBST(Arrays.copyOfRange(sequence, index, sequence.length - 1));
        return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, index))
                && VerifySquenceOfBST(Arrays.copyOfRange(sequence, index, sequence.length - 1));
    }
}
