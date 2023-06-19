public class StaticEx2
{
    //int c=0;
    static int c=0; //common for all objects

public static void cnt() //needs static keyword
{
    c++;
    System.out.println("\n Count Value "+c);
}
public static void main(String[] args)
{

    StaticEx2.cnt();
    StaticEx2.cnt();
    StaticEx2.cnt();
}
}