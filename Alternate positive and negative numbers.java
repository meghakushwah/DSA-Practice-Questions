class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < pos.size() && j < neg.size()) {
            ans.add(pos.get(i++));
            ans.add(neg.get(j++));
        }
        
        while (i < pos.size()) {
            ans.add(pos.get(i++));
        }

        while (j < neg.size()) {
            ans.add(neg.get(j++));
        }

        for (int k = 0; k < arr.size(); k++) {
            arr.set(k, ans.get(k));
        }
        
    }
}

