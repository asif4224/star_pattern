package StarPattern;

class Factorial1 {
	public int fact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n*fact(n - 1);
		}
	}
}

public class RecursionFac {
	
	static int iterative_Appproach(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			int product=1;
			for(int i=1;i<=0;i++) {
				product*=i;
			}
			return product;
		}
	}
	

	public static void main(String[] args) {
		
		Factorial1 f=new Factorial1();
		
		System.out.println(f.fact(6));
		iterative_Appproach(4);
		
		//Iterative approach
	}

}
