class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
        int hash[] = new int [256];
        for(int i = 0;i < n;i++){
            hash[nuts[i]]++;
        }
        
        int j = 0;
        for(int i = 0;i < 256;i++){
            while(hash[i] != 0){
                nuts[j] = (char)i;
                hash[i]--;
                j++;
            }
        }
        for(int i = 0;i < n;i++){
            bolts[i] = nuts[i];
        }
        
    }
}
