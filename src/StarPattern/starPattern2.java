package StarPattern;

public class starPattern2 {
	
	public static void main(String[] args) {
		
		int num=1234;
		for(int i=0;i<=num;i++) {
			int reverse=num%10;
			System.out.print(reverse);
			num=num/10;
		}
	}

}
