package 合并两个排序的链表;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        ListNode t = solution.Merge(list1, list2);
        assertEquals(1, t.val);
        assertEquals(2, t.next.val);
        assertEquals(6, t.next.next.next.next.next.val);
    }
}