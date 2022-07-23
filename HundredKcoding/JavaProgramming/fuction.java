//function with return value without arguments;
package function;
import java.util.Scanner;
public class function {
	 public static void main(String ar[]) {
		  System.out.println("Enter 2 Numbers:");
		  Scanner n=new Scanner(System.in);
	          int limit=n.nextInt();
  		  int result=sum(limit);
                  System.out.println("The result is :"+result);
	 } 
	 static int sum(int limit){ 
			  int sum=0;
	              	  for (int i=0;i<limit+1;i++) {
	         	   sum=sum+i;
		                 }
		  return sum;

		 }
}
