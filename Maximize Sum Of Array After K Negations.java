class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int prev = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > prev) i--; 
            nums[i] *= -1;
            prev = nums[i];
            k--;
            if (k == 0) break;
            if (i + 1 == nums.length) i--;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        return sum;
    }
}
