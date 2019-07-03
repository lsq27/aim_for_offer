package 剑指Offer.反转链表;

import util.ListNode;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode point1 = head.next;
        ListNode point2 = head;
        ListNode point3 = null;
        while (true) {
            point2.next = point3;
            point3 = point2;
            point2 = point1;
            if (point2 == null) {
                return point3;
            }
            point1 = point1.next;
        }
    }
}
