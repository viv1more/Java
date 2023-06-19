import java.util.*;
public class OddEven
{
    public static void main(String [] args)
    {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter the value of 'N': ");
        int x=s.nextInt();
        
       if(x%2==0 && x!=0)
        System.out.println("\nThe value Entered is Even");
        else
        System.out.println("\nThe value Entered is Odd");
    }
}
