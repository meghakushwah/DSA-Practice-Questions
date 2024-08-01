class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0,col=-1;
        int direction=1;
        while(n>0&&m>0){
            for(int i=0;i<m;i++){
                col+=direction;
                ans.add(matrix[row][col]);
            }
            n--;
            for(int i=0;i<n;i++){
                row+=direction;
                ans.add(matrix[row][col]);
            }
            m--;
            direction*=-1;
        }
        return ans;
        
    }
}
