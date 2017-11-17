package algorithm.sort;

public class MaoSort {
	private int[] A;
	public MaoSort(int[] A) {
		this.A=A;
	}
	private void maoSort() {
		for(int i=0;i<A.length-1;i++) {//循环整个数组
			for(int j=0;j<A.length-1-i;j++) {//从无序数组中循环比较
				if(A[j]>A[j+1]) {//将最大元素移动到无序数组的最后一个
					int tmp=A[j];//无序数组减掉一个元素，有序数组增加一个元素
					A[j]=A[j+1];
					A[j+1]=tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] A = {5,1,8,7,6,2,3,4};
		MaoSort ms=new MaoSort(A);
		ms.maoSort();
		for(int i:A)
			System.out.print(i+",");
	}
}

