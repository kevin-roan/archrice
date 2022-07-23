package addnumbers;
import java.util.Scanner;
public class addnumbers{ 
	public static void main(String ar[]) {
		System.out.println("Enter limit");
		Scanner s=new Scanner(System.in);
		int limit=s.nextInt();
		int sum=0;
		for (int i=0;i<limit+1;i++)
		{ 
			sum=sum+i;
		} 
		System.out.println("The Result is:" + sum);
	}
	 } 

