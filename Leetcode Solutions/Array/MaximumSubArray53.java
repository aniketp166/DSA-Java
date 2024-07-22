package Array;

public class MaximumSubArray53 {
    // leetcode 53. Maximum Subarray
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (ans < sum) {
                ans = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}
