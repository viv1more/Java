	
	// implementing NumberFormatException
	// when we enter non integer value then it is called as NumberformatException
import java.util.Scanner;
 public class slip9_4
 {
     public static void main(String [] args)
	 {
		 String str= null;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number:");
		 str= sc.next();
		 sc.close();
		 int a = Integer.parseInt(str);
		 System.out.println("a = "+a);
		  
	 }	 
 }
