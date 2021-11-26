package nov18;

import java.util.*;
public class StackPractise {
	ArrayList<Integer> list=new ArrayList<>();
	
	public void Push(int data)
	{
		list.add(data);
	}
	public void Pop() 
	{
		list.remove(list.size()-1);
		
	}
	public void peek()
	{
		System.out.println(list.get(list.size()-1));
	}
	
	public void display()
	{   
		System.out.print(list);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackPractise ob=new StackPractise();
		
		ob.Push(10);
		ob.Push(20);
		ob.Push(30);
		ob.Push(40);
		ob.Push(50);
		ob.Push(60);
		ob.Push(70);
		ob.Pop();
		
		ob.display();
		ob.peek();

	}

}
