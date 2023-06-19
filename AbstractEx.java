/*Create an Abstract Class with abstract method interest() which intializes
interest for banks, 
Create two derived Classes bank1 and bank2 which uses interest()
method of abstract class "Accept" to initialize interest of their bank */
import java.util.*;
abstract class Accept
{
    float val=0.0f;
    abstract float interest();//cannot implement means do not write coding here
    void display()
    {
        System.out.println("Its a Non-abstract class");
    }
}
class bank1 extends Accept
{
    public float interest()//implementing the abstract method
    {
        float val=7.5f;
        return val;
    }
}
class bank2 extends Accept
{
    public float interest()
    {
        float val=9.5f;
        return val;
    }
}
public class AbstractEx 
{
    public static void main(String[]args)
    {
        bank1 b1=new bank1();
        System.out.println("Bank interest rate :"+b1.interest());
        bank2 b2=new bank2();
        System.out.println("Bank interest rate :"+b2.interest());
         b1.display();
    }
    
}
