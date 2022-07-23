//need to fix:
//pending shit; some declaration problem in this one; 
package arrayinsertion;
import java.util.Scanner;
public class arrayinsertion{ 
	public static void main(String ar[]) {
		Scanner s=new Scanner(System.out);
		System.out.println("Enter Values to array:");
	//	int a[5];
		for(int i=0;i<5;i++) { 
			int a[i]=s.nextInt();
			} 
		 
		System.out.println("Array Values Are:");
		
		for(i=0;i<5;i++) {
			System.out.println(" "+a[i]);
