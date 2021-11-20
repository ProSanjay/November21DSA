package nov1;

public class FrequencyOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array= {2,3,5,5,5};
	     int target=5;
	     int result=upperBound(target,array);
	     int result1=lowerBound(target,array);
	    if(result==-1) {
	    	System.out.println("element not present");
	    }else {
	    	System.out.println("upper bound of element"+result);
	    	System.out.println("lower bound of element"+result1);
	    }
	    int frequency=result-result1+1;
	    System.out.println("frequency is "+frequency);
	}

private static int lowerBound(int target, int[] array) {
	int low=0;
	int high=array.length-1;
	
	while(low<high) {
		int mid=(low+high)/2;
		if(target<=array[mid]) {
			high=mid;
		}else {
			low=mid+1;
		}
	}
	if(array[low]!=target) {
		return -1;
	}
	return low;
	
}

	private static int upperBound(int target, int[] array) {
		int low=0;
		int high=array.length-1;
		 //int[] array= {2,3,5,5,5,5,6,6,6,6,6,8};
		while(low<=high) {
			int mid=(low+high)/2;
			if(target>=array[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(array[high]!=target) {
			return -1;
		}
		return high;
		
	}

}
