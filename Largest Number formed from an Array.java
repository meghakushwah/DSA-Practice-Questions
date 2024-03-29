class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        Arrays.sort(arr, (num1,num2) -> ((num2+num1).compareTo(num1+num2)));
        
        StringBuilder ans=new StringBuilder();
        
        for(String num: arr) ans.append(num);
        
        return ans.toString();
    }
}
