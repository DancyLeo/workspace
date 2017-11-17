package algorithm.search;

public class BinarySearch {
	
	private int[] A;

	public BinarySearch(int[] A) {
		this.A=A;
	}
	private int binarySearch(int key) {
		int left=0;
		int right=A.length-1;
		
		while(left<=right) {
			int middle=(left+right)/2;
			if(key==A[middle]) {
				return middle;
			}
			if(key>A[middle]) {
				left=middle+1;
			}
			else right=middle-1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//int[] A= {1,2,3,4,5,6,7,8};
		int[] A= {1,1,2,3,4,4,4,5};
		BinarySearch b=new BinarySearch(A);

		
		for(int i=0;i<=A.length;i++) 
		System.out.println(b.binarySearch(i));
		
	}
}
