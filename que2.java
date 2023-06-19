public class que2 
{
    static int a=1;
    public static void inc5()
    {
      a=a+5;
      System.out.println("Increment by Five "+a);
    }
    public static int inc10()
    {
        a=a+10;
        return (a);
    }
    public static void main (String[]args)
    {
        que2.inc5();
        System.out.println("Increment by Ten "+que2.inc10());
         
    }
    
}
