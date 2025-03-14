class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            max=Math.max(candies[i],max);
        }
        int low=1,high=max;
        int ans=0;
        while(low<=high)
        {
           int mid=(low+high)/2;
           if(valid(mid,candies,k))
           {
            ans=mid;
            low=mid+1;
           }
           else
           {
            high=mid-1;
           }
        }
        return ans;
    }
    public  boolean valid(int mid,int candies[],long k)
    {
        long c=0;
        for(int i=0;i<candies.length;i++)
        {
          if(candies[i]>=mid)
          {
            c+=candies[i]/mid;
          }
        }
        if(c>=k)
        return true;
        return false;
    }
}
