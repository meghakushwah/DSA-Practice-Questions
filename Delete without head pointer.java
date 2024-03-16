class Solution
{
    void deleteNode(Node del_node)
    {
         Node ptr = del_node.next;
         del_node.data = ptr.data;
         del_node.next = ptr.next;
    }
}
