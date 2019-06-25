package 合并两个排序的链表;

import util.ListNode;

public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode result = list1;
        ListNode leftPoint = list1;
        ListNode rightPoint = list1.next;
        ListNode point = list2;
        if (point.val <= leftPoint.val) {
            ListNode tmp = point.next;
            point.next = leftPoint;
            leftPoint = point;
            rightPoint = point.next;
            result = point;
            point = tmp;
        }
        while (point != null) {
            if (rightPoint == null) {
                leftPoint.next = point;
                break;
            }
            if (point.val <= rightPoint.val) {
                ListNode tmp = point.next;
                leftPoint.next = point;
                leftPoint = leftPoint.next;
                point.next = rightPoint;
                point = tmp;
            } else {
                leftPoint = leftPoint.next;
                rightPoint = rightPoint.next;
                if (rightPoint == null) {
                    leftPoint.next = point;
                    break;
                }
            }
        }
        return result;
    }
}
