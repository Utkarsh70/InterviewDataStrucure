class GfG
{
  Class Node{
     
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
   }
    //Function to find the data of nth node from the end of a linked list.
    Node head;
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int len =0;
    	Node temp = head;
    	while(temp!=null){
    	    temp=temp.next;
    	    len++;
    	}
    	if(len < n)
    	  return -1;
    	  
    	temp=head;
    	for(int i=1;i<len-n+1;i++){
    	    temp=temp.next;
    	}
    	return temp.data;
    	
    }
}