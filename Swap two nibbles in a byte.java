class Solution {
    static int swapNibbles(int n) {
        // code here
        String s ="";
        while(n>0){
            if(n%2==0){
                s="0"+s;
            }
            else{
                s="1"+s;
            }
            n=n/2;
        }
        String sb="";
        if(s.length()==8){
            sb = s.substring(4,8);
            sb=sb+s.substring(0,4);
            
        }
        else{
            while(s.length()<8){
                s="0"+s;
            }
            sb = s.substring(4,8);
            sb=sb+s.substring(0,4);
        }
        int ans =0;
        for(int i=0;i<8;i++){
            if(sb.charAt(i)=='1'){
                ans=ans+((int)Math.pow(2,7-i));
            }
        }
        
       
        return ans;
    }
}
