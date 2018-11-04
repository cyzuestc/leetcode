package leetcode;

import util.ListNode;

public class n19RemoveNthFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        for (int i = 0; i < n; i++) {
            if (fast!= null)fast = fast.next;
            else return dummy.next;
        }
        ListNode slow = dummy;

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
