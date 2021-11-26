package nov18;
import java.util.*;
public class parenthesis {
	ArrayList<Character> list=new ArrayList<>();
	
	public void Push(char data)
	{
		list.add(data);
	}
	public char Pop() 
	{   
		
		if(list.size()>0)
		return list.remove(list.size()-1);
		
		return 0;
		
	}
	public void peek()
	{
		System.out.println(list.get(list.size()-1));
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parenthesis ob=new parenthesis();
		
// String s="()()()()";
	  String s="()((({]";
	  boolean flag=true;
	  char[] arr=s.toCharArray();
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]=='('||arr[i]=='['||arr[i]=='{')
		  {
			  ob.Push(arr[i]);
		  }
		  if(arr[i]==')')
		  {
			  if(ob.Pop()!='('&& ob.list.size()>0)
			  {
				 
				  flag=false;
				  break;
			  }
				  
				  
		  }
		  if(arr[i]==']')
		  {
			  if(ob.Pop()!='['&& ob.list.size()>0)
			  {
				 
				  flag=false;
				  break;
			  }
				  
				  
		  }
		  if(arr[i]=='}')
		  {
			  if(ob.Pop()!='{'&& ob.list.size()>0)
			  {
				  
				  flag=false;
			  break;
			  }
				  
				  
		  }
		 
			  
	  }
	  if(flag)
		  System.out.print("valid");
	  else
		  System.out.print("invalid");
	  
	 
	}

}