public class ExeptionEx 
{
    public static void main(String[] args) 
    {
        int x=5, y=0;

        try{ //statements giving errors
       
        System.out.println("Division " +(x/y));
       
        }
       catch(Exception e) //this block handles errors
       
        { //System.out.println(e.getMessage());
         e.printStackTrace();
        }
       
        finally //this block will execute whether error or no
       { 
           System.out.println("Numerator is "+x);
       }
    }

}
