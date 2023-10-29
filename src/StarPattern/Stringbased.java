package StarPattern;

public class Stringbased {
	public static void main(String[] args) {
		
		String str="asif ali raksa";
		//reverse each word
		//for(int i=str.length()-1;i>=0;i--) {
			//System.out.print(str.charAt(i));
		//}
		//System.out.println(); // this is used to separate a line
		//using stringBuilder methods
		//StringBuilder reverse=new StringBuilder(str);
		//System.out.println(reverse.reverse());
		
		//System.out.println();
		
		//StringBuffer str1=new StringBuffer(str);
		//System.out.println(str1.reverse());
		
		//System.out.println();
		
		//reverse string in words
		StringBuffer sb=new StringBuffer();
		
		String [] words=str.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]).append(" ");
			
		}
		System.out.println(sb);
		

		
	}
}
