class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int n=arr.length;
        int sum=0;
        int length=0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
            if(!map.containsKey(sum)) map.put(sum,i);
            if(map.containsKey(sum-k)){
                int tempLength=i-map.get(sum-k);
                length=Math.max(length,tempLength);
            }
        }
        return length;
    }
}
