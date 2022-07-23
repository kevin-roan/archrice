package sample;
import java.util.Scanner;
public class forloop { 
	public static void main(String ar[]){ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit:");
                int limit=s.nextInt();
		int sum=0;
		for(int i=0;i<limit+1;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of all numbers are:"+sum);
                }
}
