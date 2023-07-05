class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,tw=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)
            five++;
            else if(bills[i]==10){
            five--;
            ten++;
            }
            else{
                if(ten>=1 && five>=1){
                ten--;
                five--;
                }
                else
                five-=3;
                tw++;
            }
            if(five<0 || ten<0 || tw<0)
            return false;
        }
        return true;
    }
}
