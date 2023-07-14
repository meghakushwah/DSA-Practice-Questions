class Solution {
    public String greatestLetter(String s) {
       int[] up = new int[26];
        int[] low = new int[26];
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                up[s.charAt(i)-'A']=1;
            }else{
                low[s.charAt(i)-'a']=1;
            }
        }
        for(int i=25;i>=0;i--){
            if(up[i]>0 && low[i]>0){
                ans += (char)(i+'A');
                break;
            }
        }
        return ans; 
    }
}
