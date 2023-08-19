class Solution {
    public int uniquePathsWithObstacles(int[][] Grid) {
        int dp[][]=new int[Grid.length][Grid[0].length];
        int flag=0;
        for(int i=0;i<Grid.length;i++){
            if(Grid[i][0]==1){
                flag=1;
                dp[i][0]=0;
            }
            if(flag==1) dp[i][0]=0;
            else dp[i][0]=1;
            
        }
        flag=0;
        for(int j=0;j<Grid[0].length;j++){
            if(Grid[0][j]==1){
                flag=1;
                dp[0][j]=0;
            }
            if(flag==1) dp[0][j]=0;
            else dp[0][j]=1;
            
            
        }

        for(int i=1;i<Grid.length;i++){
            for(int j=1;j<Grid[0].length;j++){
                if(Grid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
            
        }
        
        return dp[Grid.length-1][Grid[0].length-1];
    }
}
