class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n=arr.length;
        int[] ls=new int[n];
        int[] rs=new int[n];
        
        Stack<Integer> s=new Stack<>();
       
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
               s.pop();
            }
            
            ls[i] = (s.isEmpty()) ? 0 : s.peek();
            s.push(arr[i]);
        }
        
        s.clear();
        
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && s.peek()>=arr[i]){
               s.pop();
            }
            
            rs[i] = (s.isEmpty()) ? 0 : s.peek();
            s.push(arr[i]);
        }
        
        int maxdiff=0;
        int i=0;
        int j=0;
        while(i<n && j<n){
           int diff=Math.abs(ls[i]-rs[i]);
           maxdiff=Math.max(diff, maxdiff);
           i++;
           j++;
        }
        return maxdiff;

    }
}
