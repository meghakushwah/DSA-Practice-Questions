class Solution {
    Node reverseList(Node head) {
        // code here
        
        if(head==null || head.next==null) return head;
        Node t=head,p=null;
        while(t!=null){
            Node n = t.next;
            t.next=p;
            p=t;
            t=n;
        }
        return p;
    }
}
