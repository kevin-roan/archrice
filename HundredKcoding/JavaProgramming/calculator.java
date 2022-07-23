package calculator;
import java.util.Scanner;
public class calculator{  
public static void main(String ar[]) {
         System.out.println("Enter 2 Numbers:");
	 Scanner n=new Scanner(System.in);
	 int a=n.nextInt();
	 int b=n.nextInt();
	 System.out.println("1. Addition 2.Multiplication 3. Substraction  4. Division ");
	 System.out.println("Enter Choice");
	 Scanner s=new Scanner(System.in);
         int choice=s.nextInt();
        
	 int result=0; { 
	if (choice==1)
		 {
               result=a+b;
		 } 
	else if (choice==2) {
	       result=a*b; } 
	else if (choice==3) {
	       result=a-b;
	       }
 
        else if (choice==4) { 
	       result=a/b;
	 }
        else  
	 { 
	
	System.out.println("You Are a FOOl!!");
  } 
 System.out.println("The Result is:"+result); }
} 
}



