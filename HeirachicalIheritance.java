//Hierarchcial inheritance
import java.util.*;
class Accept
{
    Scanner sc= new Scanner(System.in);
    int n,m;
    void show()
    {
        System.out.print("\nEnter first number:");
        n=sc.nextInt();
        System.out.print("Enter Second number:");
        m=sc.nextInt();
    }
}
class Add extends Accept
{
    void add_res()
    {
        
        System.out.print("Addition: "+(m+n));
       
    }
}
class Sub extends Accept
{
    void sub_res()
    {
        
        System.out.print("Subtraction: "+(m-n));

    }
}
public class HeirachicalIheritance 
{
    public static void main(String[]args) 
    {
        Add a=new Add();
    Sub b= new Sub();

    a.show();
    a.add_res();

    b.show();
    b.sub_res();
    }
}
