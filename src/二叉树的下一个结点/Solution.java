package 二叉树的下一个结点;

import util.TreeLinkNode;

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null) {
            return pNode.right;
        }
        return null;
    }
}
