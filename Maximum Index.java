class Solution{
    
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int i=0;
        int j=n-1;
        int max=0;
        int maxIndex=1;
        while(i<j && j<n && (j-i)>=max)
        {
            while(arr[i]>arr[j] && maxIndex<j) j--;
            if(j!=i)
            {
                maxIndex=Math.max(j,maxIndex);
                max=Math.max(max,j-i);
            }
            
            j=n-1;
            i++;
                
            
        }
        return max;
        
    }
}

