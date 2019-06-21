package 二叉树的镜像;

import util.TreeNode;

public class Solution {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmp;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
