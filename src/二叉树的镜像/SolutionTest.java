package 二叉树的镜像;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeNode resultRoot = new TreeNode(1);
        resultRoot.left = new TreeNode(3);
        resultRoot.right = new TreeNode(2);
        solution.Mirror(root);
        assertEquals(resultRoot, root);
    }
}