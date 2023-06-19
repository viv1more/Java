//Q. Initialize variable 'n' with no-argument constructor/default constructor and
// variable 'm' with parameterized constructor. create two methods add() and mult()
//which performs the addition and multiplication for 'n' and 'm'
public class CopyConEx 
{
    int n,m;
    CopyConEx()
    {
        this(42);//call goes to parameterized constructor
        n=5;
    }
    CopyConEx(int m)
    {
        this.m=m;
    }
    void add()
    {
        System.out.println("Addition= "+(n+this.m));
    }
    void mult()
    {
        System.out.println("Multiplication= "+(n*this.m));
    }
    public static void main(String[]args)
    {
        //CopyConEx t=new CopyConEx();
        CopyConEx p=new CopyConEx();
        p.add();
        p.mult();
    }
    
}
