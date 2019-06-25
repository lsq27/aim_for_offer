package 删除链表中重复的结点;

import util.ListNode;

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null)
            return pHead;
        ListNode index1 = pHead;
        ListNode index2 = pHead;
        ListNode index3 = pHead.next;
        boolean flag = false;
        while (index3 != null) {
            if (index2.val == index3.val) {
                index2.next = index3.next;
                flag = true;
            } else {
                if (flag) {
                    flag = false;
                    index1.next = index3;
                    index3 = index3.next;
                }
                index1 = index1.next;
                index2 = index2.next;
            }
            index3 = index3.next;
        }
        return pHead;
    }
}
