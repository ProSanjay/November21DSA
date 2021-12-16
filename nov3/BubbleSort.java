package nov3;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {3,2,5,10,11,15};
		// 2,3,5,10,11,15
		// 5,2,10,3,0,4,11
		// 2,5,3,0,4,10,11
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++) {
			flag=true;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
				
			}
			if(flag) {
				System.out.println("sanja");
				break;
			}
		}
		for(int a:arr) {
			System.out.println(a);
		}

	}

}
