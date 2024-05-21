class Pair{
    int first;
    int dist;
    Pair(int first,int dist)
    {
        this.first=first;
        this.dist=dist;
    }
}

class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here
        PriorityQueue<Pair> pq=new PriorityQueue<>((z,y)->{
            if(z.dist==y.dist)
            {
                return y.first-z.first;
            }
            return z.dist-y.dist;
            });
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==x)
                continue;
            pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
        }
        int []ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.remove().first;
        }
        return ans;
    }
}

