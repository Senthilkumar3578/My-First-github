//$Id$
package First;

public class List {
 class Node{
	int data;
	Node next;
	Node(int d)
	{
		data =d;
		next=null;
	}
}
	 private Node head=null;
	 private Node tail=null;
	 private int length=0;
	 
	 public void insertFirstElement(int value)
	 {
		 Node tempnode=new Node(value);
		 if(head!=null)
		 {
			 tempnode.next=head;
			 head=tempnode;
		 }
		 else
		 {
			 head=tempnode;
			 tail=tempnode;
			 	
		 }
		 length++;   
	 }
	 public void insertLastElement(int value)
	 {
		Node tempnode=new Node(value);
		if(head!=null)
		{
			tail.next=tempnode;
			tail=tail.next;
		}
		else{
			tail=tempnode;
			head=tempnode;
			}
	 }
	 
	 public int removeFirst()
	 {
		 int first;
		 if(head!=null)
		 {
		 	  first=head.data;
		 	  head = head.next;
		 }
		 else
		 {
			return -1;
		 }
		 return first;
	 }
	 
	public int removeLast()
	{
		if(head==null)
			return -1;
		Node previous =null;
		Node currentnode =head;
		while(currentnode.next!=null)
		{
			previous=currentnode;
			currentnode=currentnode.next;
		}
		int last=currentnode.data;
		tail=previous;
		tail.next=null;
		length--;
		return last;
	}
			
	public boolean contains(int value)
	{
	
		Node currentnode =head;
		while(currentnode!=null)
		{

	      if(currentnode.data==value)
	    	  return true;
		}	
		return false;
	}
	
	public int removeIndexPosition(int value)
	{
		Node curr=head;
		Node temp=null;
		for(int i=0;i<value-1;i++)
		{
			curr=curr.next;			
		}
		temp=curr.next;
		curr.next=temp.next;
		return temp.data;
	
		
		
	} 

      public int setIndexPosition(int value,int p)
      {
    	  Node newnode=new Node(p);
    	Node temp=head;
    	for(int i=1;i<value && temp!=null;i++)
    	{
    		temp=temp.next;
    	}
    	newnode.next=temp.next;
    	temp.next=newnode;
        return 0;

      }
      
		public void display() {
		Node currentNode = head;
		while (currentNode != null) {
		System.out.print(currentNode.data + " ");
		currentNode = currentNode.next;
		}
		System.out.print("\n");
		}

}



