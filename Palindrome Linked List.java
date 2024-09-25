class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        
        Stack<Integer> s=new Stack<>();
        
        Node curr=head;
        while(curr!=null){
            s.push(curr.data);
            curr=curr.next;
        }
        
        curr=head;
        while(curr!=null){
            if(s.pop()==curr.data){
                curr=curr.next;
            }else{
                 return false;
            }
        }
        return true;
    }
}
