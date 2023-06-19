package Sequence;
import java.util.*;
public class Fact 
{
    public void show()
   {
    int f=1,n2=1,n3,i=0,n=0;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter value of n:");
	n=sc.nextInt();
	
	for(i=2;i<=n;i++)
	{
	   
	   f=f*i;
	
	}
	System.out.println("Factorial of Given Number: "+f);
   
   }

}
