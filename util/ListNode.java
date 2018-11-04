package util;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int value, ListNode next) {
        this.val = value;
        this.next = next;
    }

    public ListNode(int i) {
        val = i;
        next = null;
    }
}
