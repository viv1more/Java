import java.util.*;
class Square 
{
    int x,result;
    Scanner s=new Scanner(System.in);

    public void accept()
        {
            System.out.print("Enter the Value 'N': ");
            x=s.nextInt();
        }
    public void sq()
    {
        result=x*x;
    }    
 class Cube extends Square
{
    public void show()
    {
        System.out.print("\nThe Square is:"+result);
        System.out.print("\nThe Cube is: "+result*(x));
    }
    public static void main(String[]args)
    {
        Cube c=new Cube();
        c.accept();
        c.sq();
        c.show();
        
      

    }
}
}
