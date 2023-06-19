//Multilevel Inheritance
import java.util.*;
class Accept
{
    Scanner sc=new Scanner(System.in);
    String n,m;
    void show()
    {
        System.out.print("Enter Your Name: ");
        n=sc.next();
        System.out.print("Enter Your Stream: ");
        m=sc.next();
        
    }
}
class Marks extends Accept
{
    int tot;
    void accept_marks()
        {
            System.out.print("Enter Your Marks: "); 
            tot=sc.nextInt();
        }
}
public class NameEx2 extends Marks
{
    void display()
    {
        float x=tot*100/500;
        System.out.print("Name: "+n);
        System.out.print("Stream: "+m);
        System.out.print("Percentage: "+x+"%");
    }
    public static void main (String[]args)
    {
        NameEx2 p=new NameEx2();
        p.show();
        p.accept_marks();
        p.display();
    }
}
