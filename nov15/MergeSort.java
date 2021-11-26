package nov15;
import java.util.Scanner;
public class MergeSort {
	public static void main(String args[])
	{ 
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int[] arr=new int[N];
	
	for(int i=0;i<N;i++)
	{
		arr[i]=sc.nextInt();
	}
		
	int l=0;
	int r=arr.length-1;
	sort(arr,l,r);
	
	for(int k=0;k<N;k++)
	{
		System.out.print(arr[k]+" ");
	}
	

}
	public static void sort(int[] arr,int l,int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			merge(arr,l,r,mid);
		}
		
	}
	public static void merge(int[] arr,int l,int r,int mid)
	{
		int n1=mid-l+1;
		int n2=r-mid;
		
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(int i=0;i<n1;i++)
		{
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			R[j]=arr[mid+1+j];
		}
		int i=0;
				int j=0;
				int k=l;
		
		while(i<n1&&j<n2)
		{
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				k++;
				i++;
			}
			else
			{
				arr[k]=R[j];
			j++;
			k++;
			}
			
		}
		while(i<n1)
		{
			arr[k]=L[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr[k]=R[j];
			k++;
			j++;
		}
	}
}
