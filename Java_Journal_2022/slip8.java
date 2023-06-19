import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Votes extends Exception
{
   public Votes (String str)
   {
     System.out.println(str);
   }

}
class Slip8
{
    public static void main(String [] args)
 {
	
	Scanner s = new Scanner(System.in);
	System.out.print("Enter your age::");
	int age= s.nextInt();
	try
	{
	  if(age<18)
	  throw new Votes("Age not within Limit");
	  else
	  System.out.println("Your age is accepted");
	}
	  catch(Votes v)
	  {
	    	  System.out.println(v);
	  }
 }

}
