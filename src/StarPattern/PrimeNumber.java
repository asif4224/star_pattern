package StarPattern;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int m=0;
		int f=0;
		m=n/2;
		if(n==0 || n==1) {
			System.out.println(n+" not prime");
		}else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" not prime");
					f=1;
					break;
				}
			}
			if(f==0) {
				System.out.println(n+" prime");
			}
		}
		
	}

}
