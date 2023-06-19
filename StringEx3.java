import java.util.*;
class StringEx3
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i=0;
        System.out.println("Enter the String");
        String x=sc.nextLine();
        System.out.println("Enter the Search String");
        String y=sc.nextLine();
        StringBuffer b=new StringBuffer();
        if(x.contains(y))
        {
            
        System.out.println("Element found. Updated String...\n"+x.replace(y,"Our"));

        }
        else
        {
            
        System.out.println("Element not found .. The Original String is\n"+x);
        }
    }
            
       
}