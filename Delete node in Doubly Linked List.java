class Solution {
    public Node deleteNode(Node head, int x) {
        if(x == 1){
            if(head.next == null){
                return null;
            }
            head = head.next;
            head.prev = null;
        }
        else{
            Node current = head;
            Node previous = null;
            
            int count = 1;
            while(count <= x-1){
                previous = current;
                current = current.next;
                count++;
            }
            previous.next = current.next;
            if(current.next == null){
                return head;
            }
            current.next.prev = previous;
            
        }
        return head;
    }
}
