class Solution {
    static long sumMatrix(long n, long q) {
        
        if(q==2 || q==2*n){
            return 1;
        }
        
        if(q>2 && q<2*n){
            
            if(q<=n){
                return (q-2)+1;
            }
            if(q>n){
                return (2*n)-q+1;
            }
            
        }
        
        return 0;
    }
}
