class Solution {
    static String findLargest(int n, int s) {
        int sum = 9*n;
        if(s > sum) return "-1";
        StringBuilder str = new StringBuilder();
        
        while(s > 0) {
            if(s >= 9) {
                str.append(9);
                s -= 9;
            } else {
                str.append(s);
                s -= s;
            }
        }
        
        if(str.length() == 0 && n>1){
            return "-1";
        }
        
        while(str.length() < n) {
            str.append(0);
        }
        
        return str.toString();
    }
}
