package leetcode;

import java.util.ArrayList;

public class n155MinStack {

    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    private ArrayList<Integer> list = new ArrayList();
    Node head = new Node(Integer.MIN_VALUE);

    public n155MinStack() {
    }

    public void push(int x) {
        list.add(x);
        insertToNode(new Node(x));
    }

    public void pop() {
        deleteNode(list.get(list.size()-1));
        list.remove(list.size()-1);
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        return head.next.val;
    }

    void insertToNode(Node node){
        Node temp = head;
        Node last = head;
        while (temp!= null && temp.val<node.val){
            last = temp;
            temp =temp.next;
        }
        if (temp == null)temp = node;
        else {
            last.next = node;
            node.next = temp;
        }
    }

    void deleteNode(int x){
        if (head == null)return;
        Node temp = head;
        Node last = head;
        while (temp != null && temp.val != x){
            last = temp;
            temp = temp.next;
        }
        if (temp != null){
            last.next = temp.next;
        }
    }
}
