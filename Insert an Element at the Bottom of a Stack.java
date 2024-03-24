class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
        ArrayList<Integer> list = new ArrayList<>();
        while(!(st.isEmpty())){
            list.add(st.pop());
       }
        st.push(x);
        Collections.reverse(list);
        for(int ele : list){
            st.push(ele);
        }
        
        return st;
    }
}
