package sample;
import java.util.Scanner;
public class oddoreven {
	public static void main(String ar[]) { 
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if (a%2==0) 
			System.out.println("You Have Enterd an Even number:");
		else 
			System.out.println("You Have Enterd an Odd number:");
	}
}
