package leetcode;

import util.ListNode;

public class n25ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        int i = k;
        ListNode pre = dummy;
        ListNode temp = dummy;
        ListNode tail;

        while ((tail = getTail(pre,k)) != null){
            reverse(pre,tail);
        }

        return dummy.next;
    }

    private void reverse(ListNode pre, ListNode tail) {


    }

    //输入pre节点,获得末尾节点
    public ListNode getTail(ListNode pre,int k){
        if (pre == null)return null;
        ListNode temp = pre;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
            if (temp == null)return null;
        }
        return temp;
    }
}
