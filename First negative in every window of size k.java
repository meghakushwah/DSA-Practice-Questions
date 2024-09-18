class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] arr=new long[N-K+1];
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<N; i++){
            if(A[i]<0){
                q.add(i);
            }
        }
        
        for(int i=0; i<=N-K; i++){
           if(!q.isEmpty() && q.peek()<i){
               q.remove();
           }
           
           if(!q.isEmpty() && q.peek()<i+K){
               arr[i] = A[q.peek()];
           }else if(q.isEmpty()){
               arr[i] = 0;
           }else{
               arr[i] = 0;
           }
        }
        return arr;
    }
}
