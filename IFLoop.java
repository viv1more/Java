public class IFLoop 
{
   
    public void display(int n)
    {
        if (n<0)
        System.out.println("The number "+ n +" is negative");
        else
        System.out.println("The number"+ n + "is positive");
    }
    public static void main(String []args)
    {
        IFLoop f=new IFLoop();
        f.display(67);

    }
}
