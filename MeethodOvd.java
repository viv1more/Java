//Method Overloading//
public class MeethodOvd 
{
    int y;
    void square(int x)
    {
        y=x*x;
        System.out.println("Square= "+y);
    }
    void square()
    {
        System.out.println("Square with increament= "+(y+5));
    }
    public static void main(String[]args) 
    {
       MeethodOvd h=new MeethodOvd();
     h.square(5);
      h.square();  
    }
    
}
