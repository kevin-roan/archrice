//need to fix:
//error is down below;
// { Exception in thread "main" java.lang.ArithmeticException: / by zero
//	1 at sample.sample.main(prime-or-not.java:13) } 


package sample;
import java.util.Scanner;
import java.lang.ArithmeticException;
public class sample{
	public static void main(String ar[]){ 
		System.out.println("Enter a Number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();

	        int flag=0;

		for(int i=0;i<num/2;i++) {
			 if(num%i==0) { 
	                     flag=1;
			     break;
			 } } 

                if (flag==0) {
			 System.out.println("The Number is Prime:");
		} 
		} }

		
	  

