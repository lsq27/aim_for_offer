package 剑指Offer.对称的二叉树;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        assertTrue(solution.isSymmetrical(treeNode));
    }
}