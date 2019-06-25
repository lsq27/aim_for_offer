package 反转链表;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode = solution.ReverseList(listNode);
        assertEquals(3, listNode.val);
        assertEquals(2, listNode.next.val);
        assertEquals(1, listNode.next.next.val);
        assertNull(listNode.next.next.next);
    }
}