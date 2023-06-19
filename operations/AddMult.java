package operations;
/*create a package operations which calculates for addition
and multiplication. use the package operation in class
OperationEx to display addition and multiplication*/
public class AddMult 
{
    int x,y;
    public void add(int x, int y)
    {
        System.out.println("Addition= : "+(x+y));
    }
    public void mult(int x,int y)
    {
        System.out.println("Multiplication = : "+(x*y));
    }
}
