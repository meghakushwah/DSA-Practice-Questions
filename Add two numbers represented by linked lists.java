class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
       
        num1 = reverse(num1);
        num2 = reverse(num2);
        Node h = reverse(add(num1,num2));
        while(h!=null && h.data == 0) h = h.next;
        if(num1 != null && num2 != null && h==null) return new Node(0); 
        return h;
    }
    
    static Node add(Node head1, Node head2){
        Node newNode = new Node(-1);
        Node tail = newNode;
        boolean carry = false;
        while(head1 != null && head2 != null){
            int n1 = head1.data;
            int n2 = head2.data;
            int sum = n1 + n2;
            if(carry){
                sum++;
                carry = false;
            }
            if(sum > 9) carry = true;
            int digit = sum%10;
            Node node = new Node(digit);
            tail.next =node;
            tail = node;
            head1 = head1.next;
            head2 = head2.next;
        }
        while(head1 != null){
            int n = head1.data;
            if(carry){
                n++;
                carry = false;
            }
            if(n > 9) carry = true;
            int digit = n%10;
            Node node = new Node(digit);
            tail.next =node;
            tail = node;
            head1 = head1.next;
        }
        while(head2 != null){
            int n = head2.data;
            if(carry){
                n++;
                carry = false;
            }
            if(n > 9) carry = true;
            int digit = n%10;
            Node node = new Node(digit);
            tail.next =node;
            tail = node;
            head2 = head2.next;
        }
        if(carry){
            Node node = new Node(1);
            tail.next = node;
            tail = node;
        }
        return newNode.next;
        
    }
    
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
