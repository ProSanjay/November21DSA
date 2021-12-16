package nov2;

public class MissingTermInSequence {

	public static void main(String[] args) {
	int[] a= {1,3,5,9};
     int flag=0;
     if(a[0]%2==0) {
    	 flag=1;
     }
	int missing=missingNumber(a);
	if(flag==1) {
		if(missing%2!=0) {
			System.out.println("missing term not found");
		}else {
			System.out.println(missing);
		}
	}else {
		if(missing%2==0) {
			System.out.println("missing term not found");
		}else {
			System.out.println(missing);
		}
	}
	
	}

	private static int missingNumber(int[] a) {
		int low=0;
		int high=a.length-1;
		int diff=(a[a.length-1]-a[0])/a.length;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(mid+1<a.length && (a[mid+1]-a[mid]!=diff)) {
				return a[mid+1]-diff;
			}else if(mid-1>=0 && (a[mid]-a[mid-1]!=diff) ){
				  return a[mid-1]+diff;
			}else if(a[mid]-a[0]!=(mid-0)*diff) {
				high=mid-1;
			}else {
				low=mid+1;
			}
				
			}
		
		return -1;
	}

}
