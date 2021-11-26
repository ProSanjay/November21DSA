package nov18;
public class palindromeLinkedList
{
	class Node {
		  int data;
		  Node next;
		 
		  Node(int value) {
		    data = value;
		    next = null;
		  }
		}
    
    Node head;
    Node secondHalf = head;
    

    public void insertAtLast(int data)
    {
       
        Node newNode = new Node(data);
      
        if(head == null)
        {
            head = newNode;
            return;
        }
        
        newNode.next = null;
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
      
    }
  
    public void printList(Node head)
    {
        System.out.println("Printing the Linked List");
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println();
    }
    
   
    boolean isPalindrome(Node head)
    {
       
        Node slow = head;
       
        Node fast = head;
      
        Node prev_of_slow = head;
        
    
        Node midNode = null;
        
        boolean result = true;
        
      
        if(head != null && head.next != null)
        {
     
            while(fast != null && fast.next != null)
            {
                fast = fast.next.next;
                prev_of_slow = slow;
                slow = slow.next;
            }
           
            
            
         
            if(fast != null)
            {
              midNode = slow;
              slow = slow.next;
            }
            
           
            secondHalf = slow;
            prev_of_slow.next = null;
            
           
            reverseList();
            
         
            result = compareList(head, secondHalf);
            
           
            
            reverseList();
            
            if(midNode != null)
            {
                prev_of_slow = midNode;
                midNode.next = secondHalf;
            }
            else{
                prev_of_slow.next = secondHalf;
            }
        }
        
        return result;
    }
    

    void reverseList()
    {
        Node prev = null;
        Node current = secondHalf;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;
    }
