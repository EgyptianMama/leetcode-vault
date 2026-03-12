class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;  // Base case for n = 1

        long[] dp = new long[n + 1];  // Array to store the number of ways to climb each step
        dp[0] = 0;  // Not used, just for consistency
        dp[1] = 1;  // 1 way to climb 1 stair
        dp[2] = 2;  // 2 ways to climb 2 stairs (1+1 or 2)

        // Calculate the number of ways to climb each step up to n
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];  // Current step is the sum of the last two
        }

        return (int) dp[n];  // Return the result for n stairs
    }
}
