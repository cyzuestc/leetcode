package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers {
    public static void main(String[] args) {
        GetLeastNumbers t = new GetLeastNumbers();
        int[] a = {4,5,1,6,2,7,3,8};
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };
        //小根堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(3,comparator);
        System.out.println(maxHeap.add(5));
        System.out.println(maxHeap.add(4));
        System.out.println(maxHeap.add(3));
        System.out.println(maxHeap.add(2));
        System.out.println(maxHeap.add(1));
        maxHeap.poll();
        maxHeap.poll();
        System.out.println(maxHeap);


        System.out.println(maxHeap);


//        t.getLeastNumbers(a,4);
    }
    public ArrayList getLeastNumbers(int[] input,int k){
        ArrayList<Integer> res;
        PriorityQueue<Integer> maxHeap = new PriorityQueue(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1+o2;
            }
        });
        for(int num : input){
            if (maxHeap.size() < k)maxHeap.add(num);
            else {
                if (maxHeap.peek() > num){
                    maxHeap.poll();
                    maxHeap.add(num);
                }
            }
            System.out.println(maxHeap);
        }
        res = new ArrayList<>(maxHeap);
        return res;
    }
}
