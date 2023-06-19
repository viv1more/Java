 //implementing arithmeticException
 public class slip9_1 
{     public static void main(String [] args)
    {
        
         int x=5;
         int y=0;
         try
         {
             System.out.println("Division:"+(x/y));
         }
         catch(ArithmeticException e)
         {
            System.out.println(e);
         }
         finally
         {
            System.out.println("Numerator is:"+x);
         }
         
         
   }

    
}
