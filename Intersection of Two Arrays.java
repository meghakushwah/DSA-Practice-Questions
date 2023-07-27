class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] exist = new boolean[1001];
        for(int v : nums1) exist[v] = true;
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int idx = 0;
        for(int v : nums2) {
            if(exist[v]) {
                result[idx++] = v;
                exist[v] = false;
            }
        }
        return Arrays.copyOfRange(result, 0, idx);
    }
}
