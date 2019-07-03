package 剑指Offer.对称的二叉树;

import util.TreeNode;

public class Solution {
    //利用递归判断左右子树互为镜像,时间复杂度O(n)，空间复杂度(n)
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return isMirror(pRoot.left, pRoot.right);
    }

    boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1 == null)
            return root2 == null;
        if (root2 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }
    // TODO: 2019/6/25  非递归算法，利用DFS和BFS
}
