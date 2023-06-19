//B) String builder functions

import java.util.*;
class slip4_2
{
	 public static void main( String [] args)
   {
	 // String Builder Functions
	 System.out.println("\n**Function-1 append()**\n");
	 StringBuilder s1 = new StringBuilder("Hellow");
	 s1.append("Java");
	 System.out.println(s1);
	 System.out.println("\n**Function-2 insert()**\n");
	 s1.insert(2,"java");
	 System.out.println(s1);
	 System.out.println("\n**Function-3 replace()**\n");
	 s1.replace(1,3,"Java");
	 System.out.println(s1);
	 System.out.println("\n**Function-4 Delete()**\n");
	 s1.delete(1,3);
	 System.out.println(s1);
	 System.out.println("\n**Function-5 Reverse()**\n");
	 s1.reverse();
	 System.out.println(s1);
	 }
    }
