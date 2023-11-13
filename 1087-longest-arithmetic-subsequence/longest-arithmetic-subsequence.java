public class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        int maxLen = 2;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                int diff = nums[j] - nums[i];
                dp[i][j] = 2;

                for (int k = i - 1; k >= 0; k--) {
                    if (nums[i] - diff == nums[k]) {
                        dp[i][j] = Math.max(dp[i][j], dp[k][i] + 1);
                        break;
                    }
                }

                maxLen = Math.max(maxLen, dp[i][j]);
            }
        }

        return maxLen;
    }
}
