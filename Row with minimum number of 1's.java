class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int ans = Integer.MAX_VALUE;
        int row = 0;
        for(int i=0;i<a.length;i++){
            int count = 0;
            for(int j=0;j<a[0].length;j++){
                if(a[i][j] == 1){
                    count++;
                }
            }
            if(count < ans){
                ans = count;
                row = i;
            }
        }
        return row+1;
    }
};
