class Solution {
    public int[] runningSum(int[] nums) {
         int sum = 0;
        for (int i = 0 ; i < nums.length ; i++)
            sum += nums[i];
        for (int i = nums.length - 1 ; i >= 0 ; i--) {
            int temp = nums[i];
            nums[i] = sum;
            sum -= temp;
        }
        return nums;
    
    }
}
