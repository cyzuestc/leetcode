package leetcode;

import util.ListNode;

public class n148SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)return head;
        ListNode cur = head;
        int total = 0;
        while (cur != null){
            cur = cur.next;
            total ++;
        }
        ListNode[] list = new ListNode[total];
        cur = head;
        for (int i = 0; i < total; i++) {
            list[i] = cur;
            cur = cur.next;
            list[i].next = null;
        }
        while (total>1){
            for (int i = 0; i < total/2; i++) {
                list[i] = merge(list[i*2],list[i*2+1]);
            }
            if (total%2 == 1){
                list[total/2] = list[total-1];
                total = (total+1)/2;
            }else {
                total = total/2;
            }
        }
        return list[0];


    }


    public ListNode merge(ListNode l1,ListNode l2){
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
