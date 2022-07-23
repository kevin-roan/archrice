

package sample;
import java.util.Scanner;
public class sum {
	 public static void main(String ar[]) {
		 System.out.println("Enter a number:");
		 Scanner s=new Scanner(System.in);
		 int a=s.nextInt();
		 if (a%2==0) 
			 System.out.println("Enterd Value is even");
		 else
			 System.out.println("Enterd Value is odd");
	 }
}
