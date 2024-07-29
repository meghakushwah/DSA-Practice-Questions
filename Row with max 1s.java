class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int m = arr.length;
        int n = arr[0].length;
        int maxOnes = 0;
        int maxOnesRow = -1;
        
        for(int i = 0; i < m; i++) {
            int oneCount = 0;
            for(int j = 0; j < n; j++) {
                oneCount += arr[i][j];
            }
            if(oneCount > maxOnes){
                maxOnes = oneCount;
                maxOnesRow = i;
            }
        }
        return maxOnesRow;
        
    }
}
