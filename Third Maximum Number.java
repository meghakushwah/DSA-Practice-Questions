class Solution {
    public int thirdMax(int[] nums) {
      Set<Integer> set = new HashSet<>();
        for(int i=nums.length-1; i>=0; i--){
            set.add(nums[i]);
        }
        if(set.size() < 3) return Collections.max(set);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: set){
            pq.offer(num);
            if(pq.size() > 3) pq.poll();
        }

        if(pq.size() == 2) pq.poll();

        return pq.peek();  
    }
}
