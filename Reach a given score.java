 long[] memo = new long[n + 1];
      
        Arrays.fill(memo,-1);
        
        return countCombinations(n, memo);
    }
    
    public long countCombinations(int score, long[] memo) {
        if (score == 0) {
            return 1;
        }
        if (score < 0) {
            return 0;
        }
        if (memo[score] !=-1 ) {
            return memo[score];
        }
        
        long combinations = countCombinations(score - 3, memo) 
                          + countCombinations(score - 5, memo) 
                          + countCombinations(score - 10, memo);
        
       
        memo[score] = combinations;
        return combinations;
