package nov2;

public class SmallestMissingNumber {
  public static int smallestMissing(int[] nums,int left, int right) {
	  if(left>right) {
		  return left;
	  }
	  int mid=left+(right-left)/2;
	  if(nums[mid]==mid) {
		  return smallestMissing(nums,mid+1,right);
	  }else {
		  return smallestMissing(nums,left,mid-1);
	  }
  }
	public static void main(String[] args) {
	
     int[] a= {0,1,2,3,4,6,8,10};
     int left=0;
     int right=a.length-1;
     System.out.println(smallestMissing(a,left,right));
//     int search=++a[0]; 
//     
//   for(int i=1;i<a.length;i++) {
//	   if(search==a[i]) {
//		   search++;
//		   
//	   }else {
//		   System.out.println("Smallest missing number is:"+search);
//		   break;
//	   }
//   }
	}

}
