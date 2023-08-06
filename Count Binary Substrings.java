class Solution {
    public int countBinarySubstrings(String s) {
       int[] group = new int[s.length()];
        group[0] = 1;
        int index = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                group[++index] = 1;
            } else {
                group[index]++;
            }
        }
        int binarySubstringsCount = 0;
        for (int i = 1; i < s.length(); i++) {
            binarySubstringsCount += Math.min(group[i - 1], group[i]);
        }
        return binarySubstringsCount; 
    }
}
