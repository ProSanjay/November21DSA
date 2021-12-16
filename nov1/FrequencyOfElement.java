package nov1;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void main(String[] args) {
	int[] arr= {2,4,7,4,2,9,2,5,34};
	Arrays.sort(arr);
	int lower=lowerBound(arr,34);
	int upper=upperBound(arr,34);
	if(lower==-1) {
		System.out.println("Element is not present");
	}else {
		System.out.println(lower+""+upper);
		System.out.println("Frequency of an element:"+((upper-lower)+1));
	}

	}

	private static int upperBound(int[] arr, int target) {
		int l=0;
		int u=arr.length-1;
		while(l<=u) {
			int mid=l+(u-l)/2;
			if(target>=arr[mid]) {
				l=mid+1;
			}else {
				u=mid-1;
			}
		}
		if(arr[u]==target) {
			return u;
		}
		return -1;
	}

	private static int lowerBound(int[] arr, int target) {
     int low=0;
     int high=arr.length-1;
     while(low<high) {
    	 int mid=low+(high-low)/2;
    	 if(target<=arr[mid]) {
    		high=mid-1; 
    	 }else {
    		 low=mid+1;
    	 }
     }
     if(arr[low]==target) {
    	 return low;
     }
		return -1;
	}

}
