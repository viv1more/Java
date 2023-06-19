/*create four classes Accept to accept an integer, 
Forward class to display first 'n' numbers, 
Backward class to display reverse of 'n' numbers and 
Result class to create obects*/
import java.util.*;
class Accept
{
    Scanner sc=new Scanner(System.in);
    int n,m;
    void show()
    {
        System.out.print ("Enter the first number: ");
       n=sc.nextInt();
    }

}
class Forward extends Accept
{
    void forwd()
    {
        {
            System.out.print("\n The Numbers in Forward Sequence..\n");
            for(int i=1;i<=n;i++)
            System.out.print(i+"\t");
        }
    }
    
}
class Backward extends Accept
{
    void backwd()
    {
        System.out.print("\n\nThe Numbers in Backward Sequence\n");
            for(int i=n;i>=1;i--)
            System.out.print(i+"\t");
    }
}
public class Result1 
{
    public static void main(String[]args)
    {
        Forward f=new Forward();
        Backward b=new Backward();
        
        f.show();
        f.forwd();

        b.show();
        b.backwd();
        
    }
}
