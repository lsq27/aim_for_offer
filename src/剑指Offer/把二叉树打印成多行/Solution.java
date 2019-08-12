package 剑指Offer.把二叉树打印成多行;

import util.TreeNode;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null)
            return new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> list1 = new ArrayList<>();
        ArrayList<TreeNode> list2 = new ArrayList<>();
        list1.add(pRoot);
        for (int i = 0; list1.size() > 0; i++) {
            if (i == list1.size()) {
                i = 0;
                result.add(list);
                if (list2.size() == 0)
                    return result;
                list = new ArrayList<>();
                list1 = list2;
                list2 = new ArrayList<>();
            }
            TreeNode tmp = list1.get(i);
            list.add(tmp.val);
            if (tmp.left != null)
                list2.add(tmp.left);
            if (tmp.right != null)
                list2.add(tmp.right);
        }
        return result;
    }
}
