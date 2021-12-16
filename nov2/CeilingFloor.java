package nov2;
public class CeilingFloor {

	public static void main(String[] args) {
		int[] arr= {2,3,5,8,9,10};
		int target=10;
		int ceiling=ceiling(arr,target);
		if(ceiling==-1) {
			System.out.println("ceiling value is not present");
		}else {
			System.out.println("ceiling value is:"+arr[ceiling]);
		}
		int floor=floor(arr,target);
		if(floor==-1) {
			System.out.println("Floor value is not present");
		}else {
			System.out.println("Floor value:"+arr[floor]);
		}

	}
	public static int ceiling(int[] arr,int target) {
	int low=0;
	int high=arr.length-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(target<arr[mid]) {
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	if(low<=arr.length-1) {
		return low;
	}
		return -1;
	}
	public static int floor(int[] arr,int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(target<arr[mid]) {
				high=mid-1;
			}else if(target==arr[mid]) {
			   high=mid-1;
			   break;
			}else {
				low=mid+1;
			}
		}
		if(high>=0) {
			return high;
		}
			return -1;  
	}

}
