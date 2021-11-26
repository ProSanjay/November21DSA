package nov16;
public class MergeTwoLinkedList {
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
	    public int getSize(Node head)
	    {
	    	Node temp=head;
	    	int count=0;
	    	while(temp!=null)
	    	{
	    		temp=temp.next;
	    		count++;
	    	}
	    	return count;
	    }
	public  Node merge(Node head1,Node head2)
	{   
		
		if(getSize(head1)>getSize(head2))
		{
			Node temp=head1;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=head2;
			
			return head1;
			
		}
		else
		{
			Node temp=head2;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=head1;
			
			return head2;
		}
			
		
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoLinkedList list1=new MergeTwoLinkedList();
		MergeTwoLinkedList list2=new MergeTwoLinkedList();
		MergeTwoLinkedList list3=new MergeTwoLinkedList();
		list1.add(5);
		list1.add(15);
		list1.add(25);
		list1.add(30);
		
		list2.add(50);
		list2.add(60);
		list2.add(70);
		list2.add(80);
		list2.add(90);
		list2.add(100);
		Node tempHead=list3.merge(list1.head,list2.head);
		
		display(tempHead);
		
		
		
		
		

	}

}