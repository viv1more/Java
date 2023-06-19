/*take a string as String a=null;
then try to access the first character using charAt method, which generates NullPointerException*/

public class NullPex
{   
    public static void main(String[]args)
    {
        String a=null;
        
        try{
            char ch=a.charAt(0);
        }

        catch(NullPointerException e)
        {
            System.out.println("Character not displayed as a string is empty i.e "+e.getMessage());
        }
    }
}
