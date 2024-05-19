class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        // code here
        List<Integer> list = new ArrayList<>();
            for(int i=0;i<n; i++){
                list.add(Math.abs((arr[i]-k)));
            }
            Collections.sort(list);
            return list.get(list.size()-1);
    }
}
