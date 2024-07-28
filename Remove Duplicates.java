class Solution {
    String removeDups(String str) {
        // code here
        
        Set<Character> set=new LinkedHashSet<>();
        char[] ch=str.toCharArray();
        
        for(char i:ch){
            set.add(i);
        }
        
        StringBuilder s=new StringBuilder();
        for(char c: set){
            s.append(c);
        }
        
        return s.toString();
    }
}
