public class StaticEx1
{
    //int c=0;
    static int c=0; //common for all objects

public void cnt()
{
    c++;
    System.out.println("\n Count Value "+c);
}
public static void main(String[] args)
{

    StaticEx1 m= new StaticEx1();
    StaticEx1 n= new StaticEx1();
    StaticEx1 p= new StaticEx1();
    m.cnt(); //nst c=1 st c=1
    n.cnt(); // nst c=1 st c=2
    p.cnt();// nst c=1 st c=3

}
}