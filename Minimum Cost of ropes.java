class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        
        PriorityQueue<Long> mh=new PriorityQueue<>();
        
        for(long i : arr){
            mh.add(i);
        }
        
        long totalsum=0;
        while(mh.size()>1){
            long a=mh.remove();
            long b=mh.remove();
            long sum=a+b;
            totalsum+=sum;
            mh.add(sum);
        }
        return totalsum;
    }
}
