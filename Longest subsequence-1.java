class Solution {
    public static int longestSubseq(int n, int[] a) {
        // code here
        if (n == 0) return 0;

        int[] dp = new int[n];
        
        // Initialize the dp array with 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Fill dp array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(a[i] - a[j]) == 1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum value in dp array
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }
}
