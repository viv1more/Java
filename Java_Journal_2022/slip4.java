// a)String class Functions
import java.util.*;
class slip4
{
   public static void main( String [] args)
   {
     Scanner s =new Scanner(System.in);
	 System.out.println("Enter string 1 with spaces:");
	 String n = s.nextLine();
	 System.out.println("Enter string 2 with spaces:");
	 String m = s.nextLine();
	 System.out.println("\n**Function-1 length()**\n");
	 System.out.println("Length of"+n+"="+n.length());
	 System.out.println("\n**Function-2 Compare To()**\n");
	 if(n.compareTo(m)==0)
	 
	   System.out.println(n+" and "+m+" are equal");
	 
	 else
	 
	 System.out.println(n+" and "+m+" are not equal");
	 System.out.println("\n**Function-3 concat()**\n");
	 System.out.println(n.concat(m));
	 System.out.println(n.concat(" Concated String"));
	  System.out.println("\n**Function-4 IsEmpty()**\n");
	 System.out.println(n.isEmpty());
	 System.out.println("\n**Function-5 Trim()**\n");
	 System.out.println(n.trim().concat("Ok"));
   }

}	
