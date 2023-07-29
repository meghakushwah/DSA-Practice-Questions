class Solution {
    public double soupServings(int n) {
       if(n>4800) return 1.0;
        double dp[][] = new double[n+1][n+1];
        for(int i=0; i<=n; i++){
            Arrays.fill(dp[i], -1);
        }
        return f(n,n,dp);
    }
    double f(int n1, int n2, double dp[][]){
        if(n1<=0&&n2<=0) return 0.5;
        else if(n1<=0) return 1;
        else if(n2<=0)return 0;
        if(dp[n1][n2]!=-1) return dp[n1][n2];
        double val1 = f(n1-100, n2, dp);
        double val2 = f(n1-75, n2-25, dp);
        double val3 = f(n1-50, n2-50, dp);
        double val4 = f(n1-25, n2-75, dp);

        return dp[n1][n2] = 0.25*(val1+val2+val3+val4); 
    }
}
