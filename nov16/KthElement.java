package nov16;

class linkedList{
	Node head;
	Node tail;
	public class Node {
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
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
	public void KthElement(int k)// using two traversal
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		Node temp2=head;
		for(int i=0;i<(count-k);i++)
			{
				temp2=temp2.next;
			}
		  System.out.print("Kth element from last "+temp2.data+" ");
		  System.out.println();
		
	}
	public void KthElementPointer(int k)
	{
		Node slow=head;
		Node fast=head;
		for(int i=0;i<k-1;i++)
		{
			fast=fast.next;
		}
		while(fast.next!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		System.out.print("Kth element from last "+slow.data);
		
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{   
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		 System.out.println();
	}
	

}
public class KthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList list=new linkedList();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.display();
		list.KthElement(4);
		list.KthElementPointer(4);
		
		
		

	}

}