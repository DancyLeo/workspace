package algorithm.search;

public class MaxsubSum {
	static int index=0;
	static int count=1;
	
	public static int maxsub(int[] A) {
		int max =0 ;
		int sum =0 ;

		for(int i=0;i<A.length;i++) {
			if(sum>0) {
				sum = sum +A[i] ;
				count++ ;
				if(sum>max) {
					max = sum ;
				}
			}else {
				sum=A[i];
				index=i;
			}
		}
		return max ;
	}
	
	public static void main(String[] args) {
		//int[] A= {1,3,-2,3,4,1,-3};
		int[] A= {1,2,3,-4,-5,6,7,8};
		int maxsum = maxsub(A) ;
		System.out.println(maxsum);
		for(int i=index;i<=count;i++) {
			System.out.print(A[i]);
		}
		
	}
	
}
