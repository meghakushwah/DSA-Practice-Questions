class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
  
         HashSet<Integer> set = new HashSet<>();

        for (Integer value : head2) {
            set.add(value);
        }

        int count = 0;

        for (Integer value : head1) {
            if (set.contains(x - value)) {
                count++;
            }
        }

        return count;
    }
}
