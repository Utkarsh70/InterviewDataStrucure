
/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {

    class Node
    {
      int data;
      Node next;
      Node(int d) {data = d; next = null; }
    }
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        HashSet<Node> set = new HashSet<Node>();
        while(head!=null){
            if(set.contains(head))
              return true;
            set.add(head);
            head=head.next;
        }
        return false;
    }
}


