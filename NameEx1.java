import java.util.*;
class Accept
{
    Scanner sc=new Scanner(System.in);
    String n; int m;
    void show()
    {
        System.out.print("Enter your name: ");
        n=sc.next();
        System.out.print("Enter your value of n: ");
        m=sc.nextInt();
    }
}
public class NameEx1 extends Accept
{
    void display()
    {
        System.out.println("The Names are: \n");
        for(int i=0;i<m;i++)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args)
    {
        NameEx1 p=new NameEx1();
        p.show();
        p.display();
    }
}
