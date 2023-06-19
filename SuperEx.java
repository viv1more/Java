public class SuperEx 
{
    int x;
    SuperEx()
    {
        x=5;
    }
    
}
class InheritEx extends SuperEx
{
    public static void main(String args[])
    {
        InheritEx i=new InheritEx();
        System.out.println("Inside Sub Class but use the super class variable: "+i.x);
    }
}
