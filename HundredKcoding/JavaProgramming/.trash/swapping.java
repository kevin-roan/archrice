package swapping;
import java.util.Scanner;
public class swapping { 
	public static void main(String ar[]){ 
		 System.out.println("Enter first value:");
		 Scanner n=new Scanner(System.in);
int a=n.nextInt();
		 System.out.println("Enter second value:");
		 Scanner s=new Scanner(System.in);
//		 int a=n.nextInt();
		 int b=s.nextInt();


		 //swapping starts from here:
		 
		 int temp=0;
		 temp=a;
		 a=b;
		 b=temp;

	System.out.println("Value of A is:"+ a );
	System.out.println("Value of B is:" + b);

	} 

} 

