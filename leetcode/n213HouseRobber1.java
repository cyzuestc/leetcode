package leetcode;

import util.Print;

public class n213HouseRobber1 {
    public static void main(String[] args) {
        int[] nums = {1,1,3,6,7,10,7,1,8,5,9,1,4,4,3};
        System.out.println(new n213HouseRobber1().rob(nums));
    }

    public int rob(int[] nums) {
        if (nums == null||nums.length == 0)return 0;
        if (nums.length == 1)return nums[0];
        int[] dp = new int[nums.length+1];
        boolean[] rob1st = new boolean[nums.length+1];
        dp[0] = 0;dp[1] = nums[0];
        rob1st[0] = false;rob1st[1] = true;

        for (int i = 1; i < nums.length; i++) {
            if (dp[i]>dp[i-1]+nums[i]){
                dp[i+1] = dp[i];
                rob1st[i+1] = rob1st[i];
            }else {
                dp[i+1] = dp[i-1]+nums[i];
                rob1st[i+1] = rob1st[i-1];
            }
        }
        Print.print(dp);
        Print.print(rob1st);
        if (rob1st[rob1st.length-1])return dp[dp.length-2];
        return dp[dp.length-1];
    }
}
