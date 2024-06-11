class Solution {
    static class Pair{
        int a;
        int b;
        int diff;
        Pair(int a , int b , int diff){
            this.a = a;
            this.b = b;
            this.diff = diff;
        }
    }
    
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)-> b.diff - a.diff);
        
        for(int i =0;i<n;i++){
            pq.add(new Pair(arr[i] , brr[i] , Math.abs(arr[i]-brr[i])));
        }
        
        long sum = 0;
        int countA =0;
        int countB = 0;
        while(!pq.isEmpty() ){
            Pair p = pq.poll();
            int a = p.a;
            int b = p.b;
            
            if((a>=b && countA<x) || countB>=y){
                sum+=a;
                countA++;
            }
            else{
                sum+=b;
                countB++;
            }
        }
        return sum;
    }
}
