class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        Node temp = head;
        int size = 1;
        while(temp.next != null){
            size ++;
            temp = temp.next;
        }
        
        k = k%size;
        if(k == 0){
            return head;
        }
        
        temp.next = head;
        
        Node newTail = head;
        for(int i = 1; i < k; i++){
            newTail = newTail.next;
        }
        
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
