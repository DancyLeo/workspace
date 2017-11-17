package algorithm.sort;

public class QuickSort {
	private int[] A;
	private int begin;
	private int end;
	public QuickSort(int[] A) {
		this.A=A;
		this.begin=0;
		this.end=A.length-1;
	}
	private void quickSort(int[] A,int begin,int end) {
		if(begin<end) {//如果begin<end，说明待排序数组元素大于2个，可以继续以基准元素划分
			int p=partision(A,begin,end);//取得基准元素下标
			quickSort(A,begin,p-1);//对左半部分进行快排
			quickSort(A,p+1,end);//对右半部分呢进行快排
		}
	}
	private int partision(int[] A,int begin,int end) {
		int i=begin;//左半部分指针开始指在数组第一个元素
		int j=end;//右半部分指针开始指在数组最后一个元素
		int x=A[begin];//以数组第一个元素为基准元素
		while(i<j) {//当i，j，指针未相遇前
			while(A[j]>=x && i<j) j--;//从左向右找比x大的元素
			A[i]=A[j];
			while(A[i]<=x && i<j) i++;//从右向左找比x小的元素
			A[j]=A[i];
		}
		A[i]=x;//将基准元素放在下标i处，
		return i;//返回基准元素下标
	}
	public static void main(String[] args) {
		int[] A = {5,1,8,7,6,2,3,4};
		QuickSort qs=new QuickSort(A);
		qs.quickSort(A, qs.begin, qs.end);
		for(int i:A)
			System.out.print(i+",");
	}
}
