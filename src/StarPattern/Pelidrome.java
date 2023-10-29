package StarPattern;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelidrome {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		int temp=num;
		int rem;
		while( temp!=0) {
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
			}
		System.out.println(sum);
		if(num==sum) {
			System.out.println("Given num is Pelidrome "+num);
		}else{
			System.out.println("not a pelidrome "+num);
		}
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc1.next();
		StringBuffer str1=new StringBuffer(str);
		if(str.contentEquals(str1.reverse())) {
			System.out.println("its palidrome String");
		}
		else {
			System.out.println("not pelidrome");
		}
		
		
		
	}

}
