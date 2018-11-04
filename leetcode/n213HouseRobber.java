package leetcode;

import util.Print;

import java.util.Arrays;

public class n213HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,1,3,6,7,10,7,1,8,5,9,1,4,4,3};
        System.out.println(new n213HouseRobber().rob(nums));
    }

    public int rob(int[] nums) {
        if (nums == null||nums.length == 0)return 0;
        if (nums.length == 1)return nums[0];
        int first = nums[0];
        int end = nums[nums.length-1];
        nums[0] = 0;
        int f = robHelp(nums);
        nums[0] = first;
        nums[nums.length-1] = 0;
        int e = robHelp(nums);
        return Math.max(f,e);
    }

    public int robHelp(int[] nums) {


        int[] dp = new int[nums.length+1];
        dp[0] = 0;dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i+1] = Math.max(dp[i],dp[i-1]+nums[i]);
        }
        return dp[dp.length-1];
    }
}
