class Solution {
    public int findComplement(int num) {
        
        String s = Integer.toBinaryString(num);
        int n=s.length();

        String str="";
        int i=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='1'){
                str+='0';
            }else{
                str+='1';
            }
            i++;
        }
        return Integer.parseInt(str, 2);   
    }
}
