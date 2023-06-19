class Check//parent class or super class
{
    int x;
    Check(int y)
    {
        System.out.println("Base class constructor");
        x=y;
    }
    void ans()
    {
        System.out.println("The Square of Number is : "+(x*x));
    }
}
class SuperEx1 extends Check
{
    SuperEx1()
    {
        super (3);//it should be the first line in derive class constructor
        System.out.println("Derive Class Constructor");
    }
    void show()
    {
        System.out.println("");
        super.ans();
    }
    public static void main(String[] args)
    {
            
    }
}