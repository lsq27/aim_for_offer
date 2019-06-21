package 二叉搜索树与双向链表;

import util.DoubleTreeNode;
import util.TreeNode;

public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        DoubleTreeNode result = MyConvert(pRootOfTree);
        return result.head;
    }

    DoubleTreeNode MyConvert(TreeNode pRootOfTree) {
        DoubleTreeNode left = null, right = null;
        if (pRootOfTree.left != null) {
            left = MyConvert(pRootOfTree.left);
            pRootOfTree.left = left.foot;
            left.foot.right = pRootOfTree;
        }
        if (pRootOfTree.right != null) {
            right = MyConvert(pRootOfTree.right);
            pRootOfTree.right = right.head;
            right.head.left = pRootOfTree;
        }
        return new DoubleTreeNode(left == null ? pRootOfTree : left.head,
                right == null ? pRootOfTree : right.foot);
    }
}
