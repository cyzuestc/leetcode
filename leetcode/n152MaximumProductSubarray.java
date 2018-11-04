package leetcode;


public class n152MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null||nums.length ==0)return -1;
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for (int i = 1; i <nums.length; i++) {
            int preMax = max;
            int preMin = min;
            max = getMax(nums[i]*preMax,nums[i]*preMin,nums[i]);
            min = getMin(nums[i]*preMax,nums[i]*preMin,nums[i]);
            res = Integer.max(res,max);
        }

        return res;
    }

    public int getMax(int a,int b,int c) {
        return Integer.max(Integer.max(a,b),c);
    }

    public int getMin(int a,int b,int c) {
        return Integer.min(Integer.min(a,b),c);
    }
}
