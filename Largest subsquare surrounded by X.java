class Solution {
    int largestSubsquare(int n, char a[][]) {
        int[][] v = new int[n][n];
        int[][] h = new int[n][n];
        
        // Calculate vertical and horizontal lengths of consecutive 'X's
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                v[i][j] = 0;
                h[i][j] = 0;
                
                if(a[i][j] == 'X') {
                    if(i == 0)
                        v[i][j] = 1;
                    else
                        v[i][j] = v[i-1][j] + 1;
                    
                    if(j == 0)
                        h[i][j] = 1;
                    else
                        h[i][j] = h[i][j-1] + 1;
                }
            }
        }
        
        int maxS = 0; 
        
        // Find the largest square subgrid surrounded by 'X'
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(v[i][j] == 0 || h[i][j] == 0)
                    continue;
                
                int curr = Math.min(v[i][j], h[i][j]); 
                
                while(curr > 0) {
                    int v1 = i - curr + 1; 
                    int h1 = j - curr + 1;
                    
                    if(h[v1][j] >= curr && v[i][h1] >= curr) {
                        maxS = Math.max(maxS, curr);
                        break; 
                    }
                    curr--; 
                }
            }
        }
        
        return maxS; 
    }
};
