package sample;
import java.util.Scanner;
public class negativeorpositive{ 
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if (num<0)
			System.out.println("The value is Negative");
		else
			System.out.println("The value is Positive");
	}
}

