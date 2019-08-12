package 剑指Offer.把二叉树打印成多行;

import org.junit.jupiter.api.Test;
import util.TreeNode;

class SolutionTest {

    @Test
    void print() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        System.out.println(Solution.Print(root));
    }
}