package nov18;

class list2List
{
	class Node{
		int data;
		boolean flag=false;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node head;Node tail;
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
	public void createCycle()
	{   Node temp2=head.next.next.next;
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=temp2;
	}
	public static void displayForCycle(Node head)
	{
		Node temp=head;
		int i=0;
		while(i<20)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
			i++;
		}
	}
	public void display(Node head)
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
			
		}
	}
	
	public boolean findCycleInList() {
		
		 Node temp=head;
		 while(temp.flag!=true)
		 {
			 temp.flag=true;
			 temp=temp.next;
			 if(temp.flag==true)
			 {
				return true;
			 }
		 }
		 return false;
	    
		}
	public void removalOfCycle() {
		Node temp=head;
		while(temp.next.flag!=false)
		{   
			temp.flag=false;
			temp=temp.next;
			
		}
		temp.next=null;
		
	}
	
	
}


public class findcycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 list2List li=new  list2List();
		li.add(80);
		li.add(70);
		li.add(60);
		li.add(50);
		li.add(40);
		li.add(30);
		li.add(20);
		li.add(10);
		li.createCycle();//to create cycle in linked list
		
		
		System.out.print(li.findCycleInList());//to check cycle is present or not
	    li.removalOfCycle();// to remove cycle
		li.display(li.head);
		
		
		
	}

}
