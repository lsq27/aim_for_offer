package 二叉树中和为某一值的路径;

import util.TreeNode;

import java.util.ArrayList;

public class Solution {
    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    int target;

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        this.target = target;
        Path(root, new ArrayList<>(), 0);
        return lists;
    }

    private void Path(TreeNode root, ArrayList<Integer> list, int sum) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> listTmp = new ArrayList<>(list);
        sum += root.val;
        listTmp.add(root.val);
        if (root.left == null && root.right == null && sum == target)
            lists.add(listTmp);
        list.remove(1);
        Path(root.left, listTmp, sum);
        Path(root.right, listTmp, sum);
    }
}
