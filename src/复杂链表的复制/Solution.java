package 复杂链表的复制;

import util.RandomListNode;

import java.util.HashMap;

public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null)
            return null;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode copy = new RandomListNode(pHead.label);
        map.put(pHead, copy);
        RandomListNode point1 = copy;
        RandomListNode point2 = pHead;
        //复制next
        while (point2.next != null) {
            point1.next = new RandomListNode(point2.next.label);
            map.put(point2.next, point1.next);
            point2 = point2.next;
            point1 = point1.next;
        }
        point1 = copy;
        point2 = pHead;
        //复制random
        while (point2 != null) {
            point1.random = map.get(point2.random);
            point2 = point2.next;
            point1 = point1.next;
        }
        return copy;
    }
}
