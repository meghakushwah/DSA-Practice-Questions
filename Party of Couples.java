class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] == arr[i+1]){
                arr[i] = -1;
                arr[i+1] = -1;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != -1){
                return arr[i];
            }
        }
        return -1;
    }
}
