class Solution {
    public static long[] productExceptSelf(int nums[]) {
        int n=nums.length;
        long[] res = new long[n];
        
        for (int i = 0; i < n; i++) {
            long prod = 1;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                prod *= nums[j];
            }
            res[i] = prod;
        }
        return res;
    }
}
