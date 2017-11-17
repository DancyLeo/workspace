package algorithm.sort;
/*堆排序算法
 * 作者：夜苍山
 */
public class HeapSort {
	private int heapsize;//变化的堆大小
	
	public HeapSort(int[] A) {//初始化堆大小
		this.heapsize=A.length;
	}
	private void heapSort(int[] A) {//堆排序方法
		buildHeap(A);//建最大堆，最大堆的性质--除了根以外的所有结点的元素都小于根元素
		for(int i=A.length-1;i>0;i--) {//从堆的最后一个元素开始循环
			int temp=A[i];//根和最后一个元素交换
			A[i]=A[0];//交换后数组最后一个元素最大
			A[0]=temp;//原堆最后一个元素成为堆的根，不满足最大堆的性质
			heapsize--;//堆大小减1，
			maxHeap(A,0);//调整根元素的位置，使之满足最大堆的性质
		}
	}
	private void buildHeap(int[] A) {//建最大堆方法
		for(int i=A.length/2-1;i>=0;i--) {//从堆的最后一个非叶结点开始，因为所有叶结点可看作只有根的树，满足最大堆的性质
			maxHeap(A,i);//维护以此结点为根的树，使之满足最大堆性质
		}
	}
	private void maxHeap(int[] A, int i) {//使以下标i为根的树满足最大堆性质
		int l=2*(i+1)-1;//结点下标i的左孩子下标l，/*数学公式中计算左孩子的公式为l=2i,右孩子r=2i+1,i的取值从1开始*/
		int r=2*(i+1);//结点下标i的右孩子下标r，/*而数组中i的取值从0开始，所以计算下标的公式需要相应变化*/
		int largest;//最大元素的下标	
		if(l<=heapsize-1 && A[l]>A[i]) {//l小于heapsize-1，说明以i为根的结点左孩子存在，如果左孩子大于根
			largest=l;				//标记左孩子为最大
		}else largest=i;				//l大于heapsize-1，左孩子不存在或左孩子小于根，标记根为最大
		if(r<=heapsize-1 && A[r]>A[largest]) {//l小于heapsize，说明以i为根的结点右孩子存在，如果右孩子比标记的最大元素大
			largest=r;					  //标记右孩子为最大
		}
		if(largest!=i) {//如果最大元素不是根结点，则将根结点与最大元素交换
			int temp=A[i];
			A[i]=A[largest];//原根的位置i元素变成最大，
			A[largest]=temp;//原最大孩子结点位置largest的元素变成比根小的元素
			maxHeap(A,largest);//再以变成孩子结点的根元素为根，使之满足最大堆性质
		}
	}
	public static void main(String[] args) {
		int[] A = {5,1,8,7,6,2,3,4};
		HeapSort hs=new HeapSort(A);
		hs.heapSort(A) ;
		for(int i:A)
			System.out.print(i+",");
	}	
}
