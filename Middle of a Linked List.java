class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node fast = head;
        Node slow = head;
      
        if(head==null || head.next==null){
            return head.data;
        }
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
}
