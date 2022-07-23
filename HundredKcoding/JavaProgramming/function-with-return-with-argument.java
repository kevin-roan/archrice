//function with return value with arguments
package function;
import java.util.Scanner;
public class function {
	 public static void main(String ar[]) { 
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter 2 Numbers:");
		 int num1=s.nextInt();
		 int num2=s.nextInt();
  //		 int sum=num1+num2;
                 int result=sum(num1,num2);
		 System.out.println("Result is:"+result);

	 }
	 static int sum(int a,int b) {
		 int sum=a+b; 
		 return sum; } 
}
