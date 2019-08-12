package 经典算法.二叉树;

import org.junit.jupiter.api.Test;
import util.TreeNode;

class SolutionTest {

    @Test
    void printZTree() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        Solution.printZTree(root);
    }
}