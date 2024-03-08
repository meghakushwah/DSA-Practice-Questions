class Solution {

// additional func which validates the freq array 
    private boolean isValid(int freq[]){
        int num = 0;
        for(int i : freq){
            if(i==0)continue;
            else if(num==0)num=i;
            else if(num!=i)return false;
        }
        return true;
    }


    boolean sameFreq(String s) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

// check if the freq of all characters are already same 
        if(isValid(freq))return true;

 


       // now from 'a' to 'z' try removing a character freq and see if it can make all character frequencies equal

       for(char temp='a';temp<='z';temp++){
           if(freq[temp-'a']==0)continue;

//remove a character
           freq[temp-'a']--;


           if(isValid(freq))return true;

         // reset its value
           freq[temp-'a']++;
       }
       return false;
    }
}

