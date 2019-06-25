package 从尾到头打印链表;

import org.junit.jupiter.api.Test;
import util.ListNode;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        assertEquals(arrayList, solution.printListFromTailToHead(listNode));
    }
}