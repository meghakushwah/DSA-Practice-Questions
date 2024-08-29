class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        if(head==null) return 0;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
             
                slow=slow.next;
                int cnt=1;
                while(slow!=fast){
                    slow=slow.next;
             
                    cnt++;
                }
                return cnt;
            }
        }
        return 0;
    }
}

