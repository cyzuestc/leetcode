package leetcode;

public class n153FindMinimumInRotatedSortedArray {
    //you may assume no duplicate exists in the array
    public int findMin(int[] nums) {
        int i = 0,j = nums.length-1;
        while (i<j){
            int l = nums[i];
            int r = nums[j];
            int k = (i+j)/2;
            int m = nums[k];
            if (l<r){
                return l;
            }else {
                if (m>l){
                    i = k+1;
                }else {
                    j = k-1;
                }
            }
        }
        return 0;
    }
}
