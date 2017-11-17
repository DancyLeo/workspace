package algorithm.sort;

public class SelectSort {
	public static void selectSort(int[] A) {
		int index=0 ;
		int temp =0 ;
		for(int i=0;i<A.length;i++) {
			index = i ;
			for(int j=i;j<A.length;j++) {
				if(A[j]<A[index]) {
					index = j;
				}
			}
			temp = A[index] ;
			A[index] =A[i]  ;
			A[i] = temp ;
		}
		
	}
	
	public static void main(String[] args) {
		//int[] A = {5,1,8,7,6,2,3,4};
		int[] A = {9,8,7,6,5,4,3,2,1};
		selectSort(A) ;
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i] + " ");
			}
	}
}
	
