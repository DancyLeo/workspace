package algorithm.sort;

public class MergeSort {
	private int[] A;
	private int begin;
	private int end;
	
	public MergeSort(int[] A){
		this.A=A;
		this.begin=0;
		this.end=A.length-1;
	}
	public void mergeSort(int[] A,int begin,int end) {
		if(begin<end) {//如果begin<end，说明数组大于2个，可以继续合并排序
			int middle=(begin+end)/2;//求出带合并排序数组的中间元素下标
			mergeSort(A,begin,middle);//对前半部分数组合并排序
			mergeSort(A,middle+1,end);//对后半部分数组合并排序
			merge(A,begin,middle,end);//将前后已有序数组合并
		}
	}
	private void merge(int[] A,int begin,int middle,int end) {
		int n1=middle-begin+1;//求左半无序数组元素个数
		int n2=end-middle;//求右半无序数组元素个数
		int[] L=new int[n1+1];//创建存储左半无序数组的数组
		int[] R=new int[n2+1];//创建存储右半无序数组的数组
		for(int i=0;i<n1;i++)//将左半数组复制到数组L
			L[i]=A[begin+i];
		for(int j=0;j<n2;j++) {//将右半数组复制到数组R
			R[j]=A[middle+1+j];
		}
		L[n1]=Integer.MAX_VALUE;	//在数组最后插入哨兵（无穷大值）
		R[n2]=Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k=begin;k<=end;k++) {//对原待排序数组，依次从左右数组中取出最小的元素
			if(L[i]<R[j]) {
				A[k]=L[i];
				i++;
			}else {
				A[k]=R[j];
				j++;
			}
		}
	}
	public static void main(String[] args) {
		int[] A= {5,1,8,7,6,2,3,4};
		MergeSort ms=new MergeSort(A);
		ms.mergeSort(A, ms.begin, ms.end);
		for(int i:A)
			System.out.print(i+",");
	}
}
