public class StaticEx3
 {
     static int c=0;
     
     static
     {
         c++;
        System.out.println("\nCount Value= "+c);
     }


public static void main(String[] args)
{
   System.out.println("\nCount value from main method= "+c);
}
}

    

     
     
    

