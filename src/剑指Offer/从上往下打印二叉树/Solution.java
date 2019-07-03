package 剑指Offer.从上往下打印二叉树;

import util.TreeNode;

import java.util.ArrayList;

public class Solution {
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        ArrayList<TreeNode> point = new ArrayList<>();
        point.add(root);
        while (!point.isEmpty()) {
            ArrayList<TreeNode> pointTmp = new ArrayList<>();
            for (TreeNode p : point
            ) {
                list.add(p.val);
                if (p.left != null) {
                    pointTmp.add(p.left);
                }
                if (p.right != null) {
                    pointTmp.add(p.right);
                }
            }
            point.clear();
            point = pointTmp;
        }
        return list;
    }
}
