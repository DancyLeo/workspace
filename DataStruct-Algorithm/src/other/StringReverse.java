package other;

	public class StringReverse {  
	      
		public void swapChar(char[] c_arry,int begin,int end) {
			while(begin<end) {
				char temp=c_arry[begin];
				c_arry[begin]=c_arry[end];
				c_arry[end]=temp;
				begin++;
				end--;
			}
		}
		
		public String swapString(String str) {
			char[] char_arry=str.toCharArray();
			swapChar(char_arry,0,char_arry.length-1);
			int begin=0;
			for(int i=0;i<char_arry.length;i++) {
				if(char_arry[i]==' ' || char_arry[i]==',') {
					swapChar(char_arry,begin,i-1);
					begin=i+1;
				}
			}
			return new String(char_arry);
		}
		
	    public static void main(String[] args) {  
	        //String str = "I love java";  
	     	//String str = " hello word" ;
	    		String str = " they are the best,I don't afraid" ;
	        System.out.println(new StringReverse().swapString(str));  
	    }  
	}
