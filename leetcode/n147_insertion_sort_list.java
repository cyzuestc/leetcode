package leetcode;

import util.ListNode;

public class n147_insertion_sort_list {
    public ListNode insertionSortList(ListNode head) {
        if (head == null)return head;
        ListNode res = new ListNode(-1);
        ListNode cur = head;
        while (cur != null){
            insertIntoNewList(cur,res);
            cur = cur.next;
        }
        return res.next;
    }
    //把cur插入到res中
    private void insertIntoNewList(ListNode cur, ListNode res) {
        ListNode temp = res;
        while (temp.next != null && temp.next.val < cur.val){
            temp = temp.next;
        }
        if (temp.next == null){
            temp.next = new ListNode(cur.val);
            return;
        }
        ListNode swap = temp.next ;
        ListNode curTemp = new ListNode(cur.val);
        temp.next = curTemp;
        curTemp.next = swap;
    }
}
