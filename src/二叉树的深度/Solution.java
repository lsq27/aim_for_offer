package 二叉树的深度;

import util.TreeNode;

public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return (left > right ? left : right) + 1;
    }
}
