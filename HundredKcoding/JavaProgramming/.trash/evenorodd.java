package sample;
import java.util.Scanner;
public class evenorodd{ 
	public static void main(String ar[]) {
		 System.out.println("Enter a number:");
		 Scanner s=new Scanner(System.in);
		 int a=s.nextInt();
		 if (a%2==0)
			 System.out.println("Even number");
		 else 
			 System.out.println("Odd number");
	}
}
