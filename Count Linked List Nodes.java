class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int count=0;
        Node curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
}
