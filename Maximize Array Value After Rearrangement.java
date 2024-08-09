class Solution {
    int Maximize(int arr[]) {
        // Complete the function
        int n=arr.length;
        Arrays.sort(arr);
        long ans=0;
        long mod=1000000007;
        for(int i=0; i<n ;i++){
            ans=(ans+(long)arr[i]*i)%mod;
            
        }
        return (int) ans;
    }
}
