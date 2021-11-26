package nov19;

import java.util.*; 

public class queueUsingLinked{

	 public static class Node{
	        int data; 
	        Node next; 
	    } 

	    public  static class Queue { 
	        Node front, rear; 
	    } 

	    
	    static void enQueue(Queue q, int d)
	    { 
	        Node tp = new Node(); 
	        tp.data =d;     
	        if (q.front == null) 
	            q.front = tp; 
	        else
	            q.rear.next = tp; 

	        q.rear = tp; 
	        q.rear.next = q.front; 
	    } 

	    
	    static int deQueue(Queue q) 
	    { 
	        if (q.front == null) { 
	            System.out.print("Empty Queue");
	            
	        } 

	        
	        int d;
	        if (q.front == q.rear) 
	        { 
	         d=q.front.data; 
	            q.front = null; 
	            q.rear = null; 
	        } 
	        else 
	        { 
	            Node tp = q.front; 
	             d=tp.data; 
	            q.front = q.front.next; 
	            q.rear.next = q.front; 
	        } 

	        return d;
	        }
	    

	    // Function displaying the elements 
	    static void displayQueue(Queue q) 
	    { 
	        Node tp = q.front; 
	        System.out.print("Elements in Circular Queue are:");
	        while (tp.next != q.front) { 
	            System.out.print( tp.data+" ");
	            tp = tp.next; 
	        } 
	        System.out.print(tp.data+" ");
	    } 

	    
	    public static void main(String args[]) 
	    { 
	      
	        Queue q = new Queue(); 
	        q.front = q.rear = null; 

	       
	        enQueue(q, 20); 
	        enQueue(q, 40); 
	        enQueue(q, 60); 

	    
	        displayQueue(q); 

	     
	        displayQueue(q); 
	    
	        enQueue(q, 80); 
	        displayQueue(q); 
	    } 
	} 