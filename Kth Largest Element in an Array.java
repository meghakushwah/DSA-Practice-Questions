class Solution {
    public int findKthLargest(int[] nums, int k) {
      for(int i=0;i<nums.length;i++)
            nums[i] = nums[i]*(-1);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
            nums[i] = nums[i]*(-1);
        return nums[k-1];
    }
}
