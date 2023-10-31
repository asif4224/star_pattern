package StarPattern;

public class SumOdigit_evensum_oddsum {
	  public static void main(String[] args) {
		  int num=1223481;
		  int even_count=0;
		  int odd_count=0;
		  int count=0;
		  int rem=0;
		  while(num>0){
		      rem=num%10;
		       count=count+rem;
		       if(rem%2==0){
		           even_count=even_count+rem;
		       }else{
		           odd_count=odd_count+rem;
		       }
		       num=num/10;
		  }
		  System.out.println(even_count+" evensum");
		  System.out.println(odd_count+" oddsum");
		  System.out.println(count+" digitsum");

	}
}
