package util;

public class util {
    public static void print(Node node){
        Node temp = node;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
