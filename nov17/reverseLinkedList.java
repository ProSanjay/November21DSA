package nov17;

class reverseList{
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
		
	}
	public static Node head;
	Node tail;
	public void add(int data)
	{
		Node temp=new Node(data);
		Node temp2=head;
	    if(head==null)
	    {
	    	head=temp;
	        tail=temp;
	    }
	    else 
	    {
	    	while(temp2.next!=null)
	    	{
	    		temp2=temp2.next;
	    	}
	    	temp2.next=temp;
	    	tail=temp;
	    }
	}
	public Node reverse(Node head)
	{
		Node current=head;
		Node prev=null;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}
	

public static void display(Node head)
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}
}

public class reverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseList li=new reverseList();
		li.add(80);
		li.add(70);
		li.add(60);
		li.add(50);
		li.add(40);
		li.add(30);
		li.add(20);
		li.add(10);
	     li.head=li.reverse(reverseList.head);
		reverseList.display(reverseList.head);
		

	}

}