package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static void main(String[] args) {
        FairCandySwap t = new FairCandySwap();
        int[] a = {1,2};
        int[] b = {2,3};
        t.print(t.fairCandySwap(a,b));
    }

    public void print(int[] a){
        for (int x:a) System.out.print(" "+x);
        System.out.println();
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int totalA = 0;
        int totalB = 0;
        Set<Integer> set = new HashSet();
        for (int x : A){
            totalA += x;
        }
        for (int x : B){
            totalB+= x;
            set.add(x);
        }
        //a多出来的值
        int d = (totalA-totalB)/2;
        for (int x: A){
            if (set.contains(x-d))return new int[]{x,x-d};
        }
        return null;
    }
}
