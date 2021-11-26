package nov19;

class Queue{
	int size;
	int rear;
	int front;
	int[] queue=new int[10];
	public void enqueue(int data)
	{   if(size==10)
		System.out.println("queue is full");
	else
	{
		queue[rear%10]=data;
		rear++;
		size++;
	}
	}
	public void dequeue()
	{   if(isEmpty())
		 System.out.println("Queue is empty");
	else
	{
		front++;
	    size--;
	}
	}
	public boolean isEmpty()
	{
		if (size==0)
		{
			return true;
		}
		else
			return false;
	}
	public void show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[(front+i)%10]+" ");
			
		}
		System.out.println();
	}
}
public class QueueUsngArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue Q=new Queue();
		Q.dequeue();
		Q.enqueue(5);
		Q.enqueue(15);
		Q.enqueue(25);
		Q.enqueue(35);
		Q.enqueue(45);
		Q.enqueue(55);
		
		Q.enqueue(45);
		Q.enqueue(55);
		Q.enqueue(65);
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
		Q.dequeue();
        Q.show();
       
        System.out.println("size: "+Q.size);
	}

}