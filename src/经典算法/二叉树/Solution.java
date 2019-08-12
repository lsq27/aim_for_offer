package 经典算法.二叉树;

import util.TreeNode;

import java.util.Stack;

public class Solution {
    //Z字打印二叉树
    public static void printZTree(TreeNode root) {
        boolean flag = true;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.empty() || !stack2.empty()) {
            while (!stack1.empty()) {
                TreeNode tmp = stack1.pop();
                System.out.println(tmp.val);
                if (tmp.left != null)
                    stack2.push(tmp.left);
                if (tmp.right != null)
                    stack2.push(tmp.right);
            }
            while (!stack2.empty()) {
                TreeNode tmp = stack2.pop();
                System.out.println(tmp.val);
                if (tmp.right != null)
                    stack1.push(tmp.right);
                if (tmp.left != null)
                    stack1.push(tmp.left);
            }
        }
    }
}
