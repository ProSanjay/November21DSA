package nov3;

public class InsertionSort {

	public static void main(String[] args) {
	int[] arr= {5,3,2,24,23,22};
	for(int i=1;i<arr.length;i++) {
		int temp=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>temp) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=temp;
	}
	for(int a:arr) {
		System.out.println(a);
	}

	}

}
