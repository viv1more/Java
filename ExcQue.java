import java.util.*;
class AGEex extends Exception
{
    public AGEex(String s)
    {
        super(s);
    }
}
class ExcQue
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Age:");
        
        int a=s.nextInt();
        
        try{//statements giving errors
            if(a<18)
            throw new AGEex("Voting Not allowed below 18 age");
            else
            System.out.println("Voting Allowed");
        }
        catch(AGEex e)//this block handles exceptions
        {
            System.out.println(e.getMessage());
        }
    }
}
