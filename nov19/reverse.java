package nov19;

import java.util.Stack;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stck=new Stack<Character>();
		String str="hello";
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			stck.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{   char c=stck.peek();
			System.out.print(c);
			stck.pop();
		}
		
		

	}

}