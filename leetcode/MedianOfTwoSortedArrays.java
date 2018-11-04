package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int nums1[], int nums2[]) {
        int len = nums1.length+nums2.length;
        if (len%2 == 0)return (getKth(nums1,0,nums2,0,len/2)+getKth(nums1,0,nums2,0,len/2+1))/2.0;
        else return getKth(nums1,0,nums2,0,len/2)/1.0;
    }

    public int getKth(int a[],int startA, int b[],int startB,int k){
        if (startA>=a.length)return b[startB+k-1];
        if (startB>=b.length)return a[startA+k-1];
        if (k == 1)return Math.min(a[startA],b[startA]);

        int ath = startA+k/2-1;
        int bth = startB+k/2-1;

        int midA = ath>=a.length?Integer.MAX_VALUE:a[ath];
        int midB = bth>=b.length?Integer.MAX_VALUE:b[bth];

        if (midA > midB){
            return getKth(a,startA,b,startB+k/2,k-k/2);
        }else
            return getKth(a,startA+k/2,b,startB,k-k/2);
    }
}
