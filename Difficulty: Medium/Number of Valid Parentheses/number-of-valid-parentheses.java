class Solution {

    public int findWays(int n) {

        if ((n & 1) == 1)
            return 0;

        int pairs = n / 2;

        long[] dp = new long[pairs + 1];

        dp[0] = 1;

        for (int i = 1; i <= pairs; i++) {

            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }

        return (int) dp[pairs];
    }
}