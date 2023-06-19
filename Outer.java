public class Outer 
{
    private int data=30;
    class Inner
    {
        void msg()
        {
            System.out.println("Data is "+data);
        }
    }
    public static void main(String[] args) 
    {
        Outer obj=new Outer();//create outer class object
        Outer.Inner i=obj.new Inner();//outer needs reference of inner class
        i.msg();
    }
}
