class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int n=arr1.length;
        int m=arr2.length;
        
        int[] arr=new int[n+m];
        int ans=0;
        
        System.arraycopy(arr1, 0, arr, 0, n);
        System.arraycopy(arr2, 0, arr, n, m);
        
        Arrays.sort(arr);
        int sum=n+m;
        int mid=sum/2;
        
        
        if(sum%2==0){
            return arr[mid-1]+arr[mid];
        }
        return (arr[mid]);
    }
}
