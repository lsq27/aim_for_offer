package 剑指Offer.二叉搜索树的第k个结点;

import util.TreeNode;

public class Solution {
    int count = 0;
    int k = 0;
    TreeNode result;

    void Search(TreeNode pRoot) {
        if (pRoot == null)
            return;
        if (pRoot.left != null)
            Search(pRoot.left);
        count++;
        if (count == k) {
            result = pRoot;
            return;
        }
        if (count > k)
            return;
        if (pRoot.right != null)
            Search(pRoot.right);
    }

    TreeNode KthNode(TreeNode pRoot, int k) {
        this.k = k;
        Search(pRoot);
        return result;
    }
}
