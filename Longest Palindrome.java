class Solution {
    public int longestPalindrome(String s) {
        
        int odd = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }   
        for(Object value : map.values()) if((int)value%2 != 0) odd++;
              
        return odd > 0? n - odd + 1: n; 
    }
}
