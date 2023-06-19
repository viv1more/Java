import java.util.*;
public class StringEx
{
    public static void main(String []args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String 1 with Spaces :");
        String n=sc.nextLine();
        System.out.println("Enter a String 2 with Spaces :");
        String m=sc.nextLine();

        
        System.out.println("\n**Function-1 length()**\n:");
        System.out.println("Length of "+n+" ="+n.length());
        System.out.println("\n**Function-2 compareTo()**");
        if(n.compareTo(m)==0)
         System.out.println(n+" and "+m+" are equal");
         else
         System.out.println(n+" and "+m+" are not equal");
         System.out.println("\n**Function-3 concat()**\n");
         System.out.println(n.concat(m));
         System.out.println(n.concat("City"));
         System.out.println("\n**Function-4 isEmpty()**\n");
         System.out.println(n.isEmpty());
         System.out.println("\n**Function-5 trim()**\n");
         System.out.println(n.trim().concat("OK"));
         System.out.println("\n**Function-6 endsWith**\n");
         if (n.endsWith("Java"))
             System.out.println("Success");
         System.out.println("\n**Function-7 toUpperCase()**\n");
         System.out.println(n.toUpperCase());
         System.out.println(m.toLowerCase());

         System.out.println("\n**Function-8 replace()**\n");
         System.out.println(n.replace("Good","Beautiful"));
         System.out.println("\n**Function-9 contains()**\n");
         if(n.contains("Pune"))
         System.out.println("found");
         else 
         System.out.println("not found");
         System.out.println("\n**Function-10 equalsIgnoreCase()**\n");
         if(n.equalsIgnoreCase(m))
         System.out.println(n+" and "+m+ " are equal ");
         else 
         System.out.println(n+" and "+m+ " are not equal");
    }  
}
