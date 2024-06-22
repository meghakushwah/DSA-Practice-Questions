class Solution {
    public long ExtractNumber(String s) {
        long ans = -1; 
        String[] words = s.split(" "); 
        
        for (String word : words) {
            if (isNumber(word) && !word.contains("9")) { 
                long num = Long.parseLong(word);
                ans = Math.max(ans, num); 
            }
        }
        
        return ans;
    }
    
    private boolean isNumber(String word) {
     
        for (char c : word.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; 
            }
        }
        return true; 
    }
}
