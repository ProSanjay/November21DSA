package nov2;

public class NumberOfRotation {

	public static void main(String[] args) {
     int[] arr= {10,15,16,17,1};
     int pivot=pivot(arr);
     if(pivot==-1) {
    	 System.out.println("Rotation doesn't happen");
     }else {
    	 System.out.println("Number of rotation:"+(pivot)); 
     }
     

	}
 public static int pivot(int[] arr) {
	 int low=0;
	 int high=arr.length-1;
	 while(low<high) {
		 int mid=low+(high-low)/2;
		 if(arr[mid]<arr[mid-1] ) {
			return mid; 
		 }else if(arr[mid]>arr[mid+1]) {
			 return mid+1;
		 }else if(arr[mid]>arr[arr.length-1]) {
			 low=mid+1;
		 }else {
			 high=mid-1;
		 }
	 }
	 return -1;
 }
}
