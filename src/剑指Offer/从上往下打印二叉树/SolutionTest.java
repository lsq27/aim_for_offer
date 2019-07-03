package 剑指Offer.从上往下打印二叉树;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.right = new TreeNode(4);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(4);
        assertEquals(list, solution.PrintFromTopToBottom(root));
    }
}