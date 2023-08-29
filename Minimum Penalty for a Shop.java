class Solution {
    public int bestClosingTime(String customers) {
        int pos=-1, n=0;
        for(int i=0; i<customers.length(); i++){
          char ch=customers.charAt(i);
          if (ch=='N') {
              n--;
              if(pos==-1||n>=0){
                  pos=i;
                  n=-1;
              }
          }
          else if (ch=='Y' && pos!=-1){
              n++;
          }
        }
        if(n<=0 && pos!=-1)
        return pos;
        return customers.length();

    }
}
