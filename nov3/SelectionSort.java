package nov3;

public class SelectionSort {

	public static void main(String[] args) {
     int[] arr= {5,2,10,3,0,4,11};
     for(int i=0;i<arr.length-1;i++) {
    	 int min=i;
    	 for(int j=i+1;j<arr.length;j++) {
    		if(arr[min]>arr[j]) {
    			min=j;
    		}
    	 }
    	 int temp=arr[i];
    	 arr[i]=arr[min];
    	 arr[min]=temp;
    	 }
     for(int a:arr) {
    	 System.out.println(a);
     }
	}

}
