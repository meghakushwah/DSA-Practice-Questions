class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;  
        ListNode current = head;
        if(head == null) return null;
        while(current != null) { 
            ListNode tmp = current.next;
            current.next = previous;
            previous = current;
            current = tmp;
        }
       return previous; 
    }
}
