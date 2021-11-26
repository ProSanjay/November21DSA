package nov19;

class Stack12 {
	int[] stack=new int[10];
	int top=0;
	int sum=0;
	int max=Integer.MIN_VALUE;
	
	public void push(int data)
	{   
		if(stack.length==size())
		{
			System.out.println("overflow");
		}
		else
		{
			sum=sum+data;
			if(data>max)
				max=data;
		stack[top]=data;
		top++;
		}
		
	}
	public void pop()
	{ 
		if(isEmpty())
        {
	      System.out.println("hey stack is empty");
        }
		else
		{	
		top--;
	int data=stack[top];
		stack[top]=0;
		}
		
		
	}
	public void getMax()
	{
		System.out.println(max);
	}
	public void getAvg()
	{ int avg;
		if(size()>0)
		{
			avg=sum/size();
			
		}
		else if (size()==0)
			avg=stack[0];
		else
			avg=0;
		
		System.out.println(avg);
			
			
	}
	public void peek()
	{
		System.out.println(stack[top-1]);
	}
	public int size()
	{
		return top;
	}
	public void show()
	{   for(int i=0;i<top;i++)
		System.out.print(stack[i]+" ");
	}
	public boolean isEmpty()
	{
		if(top==0)
			return true;
		else
			return false;
	}

 }
	
	public class Stack{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stack12 obj=new Stack12();
	
	
	obj.push(10);
	obj.push(20);
	obj.push(30);
	obj.push(40);
	obj.push(50);
	obj.push(60);

	obj.peek();

	obj.show();
	obj.getMax();
	obj.getAvg();
 
	}

}
