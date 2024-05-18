class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here
       int max =a.get(0);
        for(int i=1;i<a.size();i++){
            if(a.get(i)>max){
                max = a.get(i);
            }
        }
        return max;
    }
}
