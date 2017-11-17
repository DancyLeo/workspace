package algorithm.sort;


public class InsertSort {
	private int[] A;
	public InsertSort(int[] A) {
		this.A=A;
	}
	private void insertSort() {
		for(int i=0;i<A.length;i++) {//循环整个数组
			for(int j=i;j>0;j--) {//从已排序下一个与有序数组循环比较
				if(A[j]<A[j-1]) {//未排序数组第一个元素与已排序数组最后一个元素比较
					int temp=A[j];//如果A[j]小于A[j-1]，交换并继续向前比较；
					A[j]=A[j-1];
					A[j-1]=temp;
				}
			}
		}
	}
	private static void main(String[] args) {
		int[] A={5,1,8,7,6,2,3,4};
		InsertSort is=new InsertSort(A);
		is.insertSort();
		for(int i:A)
			System.out.print(i+",");
	}
}
