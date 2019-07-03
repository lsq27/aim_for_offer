package 剑指Offer.和为S的两个数字;

import org.junit.jupiter.api.Test;
import util.TreeNode;
import 剑指Offer.二叉树的深度.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        TreeNode treeNode=new TreeNode(1);
        solution.TreeDepth(treeNode);
        //assertEquals(new ArrayList<>(Arrays.asList(1, 2)), solution.FindNumbersWithSum(new int[]{1, 4, 2, 3}, 5));
    }
}