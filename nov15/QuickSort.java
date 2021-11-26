package nov15;
import java.util.Scanner;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		quickSort(arr,0,arr.length-1);
		for(int x:arr)
			System.out.print(x+" ");

	}
	public static void quickSort(int[] arr,int left,int right)
	{  if(left<right)
	{
		int p=partion(arr,left,right);
		quickSort(arr,left,p-1);
		quickSort(arr,p+1,right);
	}
	}
	public static int partion(int[] arr,int left,int right)
	{
		int i=left-1;
		int pivot=arr[right];
		for(int j=left;j<=right-1;j++)
		{
			if(arr[j]<pivot)
			{    i++;
				swap(arr,i,j);
				
			}
		}
		swap(arr,i+1,right);
		return i+1;
		
	}
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}