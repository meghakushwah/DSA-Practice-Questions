class Solution {
    public boolean compute(Node root) {
        StringBuilder temp = new StringBuilder();
        while(root!=null){
            temp.append(root.data);
            root = root.next;
        }
        String concat = temp.toString();
        int i = 0;
        int j = concat.length()-1;
        while(i<j){
            if(concat.charAt(i)!=concat.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

