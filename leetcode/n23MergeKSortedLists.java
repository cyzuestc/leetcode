package leetcode;

import util.ListNode;

import java.util.List;

public class n23MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)return null;
        int size = lists.length;
        while (size >1) {
            for (int i = 0; i < (size ) / 2; i++) {
                lists[i] = merge2Lists(lists[2 * i], lists[2 * i + 1]);
            }
            if (size % 2 == 1) {
                lists[size / 2] = lists[size - 1];
                size = (size + 1) / 2;
            }
            size = size / 2;
            System.out.println(size);
        }
        return lists[0];
    }

    public ListNode merge2Lists(ListNode l1,ListNode l2){
        //l1>=l2
        if (l1 == null)return l2;
        if (l2 == null)return l1;
        //保证l1的Head是最小的
        if (l2.val < l1.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode head = l1;
        ListNode res = head;
        l1 = l1.next;
        while (l1 != null && l2 != null){
            if (l1.val<l2.val){
                head.next = l1;
                l1 = l1.next;
            }
            else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 == null)head.next = l2;
        if (l2 == null)head.next = l1;
        return res;
    }
}
