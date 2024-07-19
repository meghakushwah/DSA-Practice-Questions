class Solution {
    int[] constructLowerArray(int[] arr) {
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int a=arr[i];
            int c=0;
            for(int j=i+1;j<arr.length;j++){
                if(a>arr[j]) c++;    
            }
            ans[i]=c;
        }
        return ans;
    }
