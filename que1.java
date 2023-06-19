public class que1
 {
   static int i=2;
   static
   {
       System.out.print("The Square of Given Number "+i+ " is= ");
       i=i*i;  
       System.out.println(i);
   } 
   public static void cube()
   {  
    System.out.println("\n The cube of given number " + i + " is= "+i*i*i);
   }
    public static void main(String [] args)
    {
        que1.cube();
    }
}
