class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        for(int i = 0; i < n / 2; i++){
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            
            if(leftChild < n && arr[i] < arr[leftChild]){
                return false;
            }
            
           
            if(rightChild < n && arr[i] < arr[rightChild]){
                return false;
            }
        }
        return true;
    }
}
