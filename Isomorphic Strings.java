class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n!=m) return false;
        if(s.equals(t)) return true;

        Map<Character, Character> map = new HashMap<>();
     
    for(int i=0; i<n; i++){
        char c = s.charAt(i);
        char d = t.charAt(i);

        if(map.containsKey(c)){
            if(!map.get(c).equals(d)) return false;
        }
        else{

            if(map.containsValue(d)) return false;

            map.put(c, d);
        }

    }
    return true;

    }
}
