class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        Arrays.sort(arr);        
        for(int i=n-1;i>=n-k;i--){
            ans.add(arr[i]);
        }
        return ans;
    }
}
