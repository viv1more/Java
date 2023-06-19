//accept two numbers in class "TwoNumbers" and display addition in class Addition
import java.util.*;
class Addition
{
    Scanner sc=new Scanner(System.in);
    int a,b;
    void add()
    {
        System.out.print("Enter 1 st Number: ");
        a=sc.nextInt();
        System.out.print("Enter 2 nd Number: ");
        b=sc.nextInt();
    }
    
}
public class TwoNumbers extends Addition
{
    
    void display()
    {
        System.out.println("Addition="+(a+b));
    }
    public static void main(String[]args)
    {
        TwoNumbers n=new TwoNumbers();
        n.add();
        n.display();

    }
    
}

