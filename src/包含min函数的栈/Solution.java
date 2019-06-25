package 包含min函数的栈;

import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    Stack<Integer> stack = new Stack<>();
    LinkedList<Integer> list = new LinkedList<>();

    {
        list.add(Integer.MAX_VALUE);
    }

    public void push(int node) {
        stack.push(node);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= node) {
                index = i;
                break;
            }
        }
        list.add(index, node);
    }

    public void pop() {
        int t = stack.pop();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == t) {
                list.remove(i);
                break;
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return list.get(0);
    }
}
