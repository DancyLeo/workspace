package algorithm.search;
import java.util.ArrayList;
/*KMP算法
 * 作者：夜苍山
 */
public class KMP {
	private ArrayList<Integer> s;
	
	public KMP() {
		this.s=new ArrayList<Integer>();
	}
	
	private int[] nextList(char[] P) {
		int m=P.length;//字符数组的长度
		int[] next=new int[m];//创建跳转表
		int k=0;//模式串最长公共前后缀等于k
		next[0]=0;//模式串的第一个字符对应跳转表的k值为0；
		
		for(int q=1;q<m;q++ ) {//从模式串的第二个字符开始，构造跳转表
			while(k>0 && P[k]!=P[q]) {//（1.1）**如果k>0,且P[k]与P[q]不相等**,
									//说明[0,q-1]存在大于0的最长公共前后缀，且[0,q-1]的最长公共前后缀的下一个字符P[k]与当前字符P[q]不相等；	 
				k=next[k-1];			//（1.1.1）将[0,q-1]字符串的最长公共前后缀赋值给k,
									// [0,k-1]为[0,p-1]的最长公共前后缀，递归比较最长前后缀的最长前后缀的下一个字符与P[q];
	
			}						
							//（1.2）**如果k>0,且P[k]与P[q]相等**,
						    //说明[0,q-1]存在大于0的最长公共前后缀，且[0,q-1]的最长公共前后缀的下一个字符P[k]与当前字符P[q]相等，
							//最长公共前后缀应该在[0,q-1]的最长公共前后缀的基础上加1，执行下面的if语句；
			if(P[k]==P[q]) {//（1.3）**如果k=0,，且P[k]与P[q]相等**,说明找到了长度为1的最长公共前后缀，k加1；
				k++;
			}
			next[q]=k; 		//（1.4）**如果k=0,，且P[k]与P[q]不相等**，说明最长公共前后缀依旧为0，当前字符串[0,q]的最长公共前后缀为0；
		}
		return next;
	}
	
	private ArrayList<Integer> kmp(String txt,String ps) {
		char[] T=txt.toCharArray();//待匹配文本
		char[] P=ps.toCharArray();//匹配模式串
		int n=T.length;
		int m=P.length;
		int[] next=nextList(P);	//构造跳转表
		int q=0;//已匹配字符数
		//ArrayList<Integer> s=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {//与构建跳转表思路一样
			while(q>0 && P[q]!=T[i]) {
				q=next[q-1];
			}
			if(P[q]==T[i]) {
				q++;
			}
			if(q==m) {//q=m，匹配成功
				
				s.add(i);//记录匹配偏移量
				q=next[q-1];
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		KMP k=new KMP();
		String txt="abaabcabdddd";
		String ps="ab";
		ArrayList<Integer> slist=k.kmp(txt, ps);
		for(int i:slist)
		System.out.println("match at="+ i);
	}
}
