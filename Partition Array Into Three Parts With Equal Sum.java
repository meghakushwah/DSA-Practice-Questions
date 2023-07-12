class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
       int sum = 0;
        for(int i : arr){
            sum += i;
        }
        int average = sum / 3;
        int total = 0;
        int count = 0;

        for(int i : arr){
            total += i;
            if(total == average){
                count++;
                total = 0;
            }
        }
        return count >= 3 && sum % 3 == 0; 
    }
}
