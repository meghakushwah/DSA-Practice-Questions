class Solution {
    public int subsetXORSum(int[] nums) {
         List<Integer>ans = new ArrayList<Integer>();  
        helper(0, nums,ans, 0);
        int sum=0;
        for(int i:ans)
        {
            sum+=i;
        }
        return sum;
    }
    public void helper(int i, int[] arr, List<Integer>al, int xor)
    {
        if(i>=arr.length)
        {
            al.add(xor);
            return;
        }
        int newx = xor^arr[i];
        helper(i+1, arr, al, newx);
        helper(i+1, arr, al, xor);
    }
}
