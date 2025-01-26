class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        Node prev = null;

        // Detect loop using Floyd’s cycle-finding algorithm
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, there is a loop
            if (slow == fast) {
                // Find the start of the loop
                while (slow != head) {
                    prev = slow;
                    slow = slow.next;
                    head = head.next;
                }
                // Break the loop
                prev.next = null;
                break;
            }
        }
    }
}
