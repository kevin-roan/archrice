package function;
import java.util.Scanner;
public class function{
	public static void main(String ar[]) {
		System.out.println("Enter limit");
		Scanner s=new Scanner(System.in);
		int limit=s.nextInt();
		int sum=loop(limit);
		int result=last(sum);
	}
	
	static int loop(int limit) {
		 int sum=0;
		 for (int i=0;i<limit+1;i++) 
		 {
			sum=sum+i; } 
	          return sum;  }

	static int last(int result) {
		System.out.println("The result is:"+result); 
        return 0;
	} 
}	
