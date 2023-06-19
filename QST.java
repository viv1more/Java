//Q. Accept a number if the number is positive and less than 10 display the square otherwise display the number
//display message if the number is negative
import java.util.*;
public class QST
{
    public static void main (String [] args0)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int a=s.nextInt();
        if(a>0)
        {
            System.out.println("The number is positive");
             if (a<10)
             {
                 System.out.println("The Square is "+a*a);
             }
        }
        else
        System.out.println("The Number is Negative");
    }
    
}
