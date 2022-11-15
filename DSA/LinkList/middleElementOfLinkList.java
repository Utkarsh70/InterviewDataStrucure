class Solution
{
    Node head;
class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
    int getMiddle(Node head)
    {
        // Your code here.
        Node slowPtr=head;
        Node fastPtr = head;
        while(fastPtr !=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;
       
    }
}
