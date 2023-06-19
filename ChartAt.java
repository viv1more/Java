//Accept letter a for addition and m for multiplication other wise say invalid choice
//chat ch = sc.next().charAt(0)
import java.util.*;
public class ChartAt 
{   
     public static void main(String[] args) 
    {  
           
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch= sc.next().charAt(0);
        System.out.print("Enter Number First: ");
        int x=sc.nextInt();
        System.out.print("Enter Number Second: ");
        int y=sc.nextInt();
        System.out.println("The Character is: "+ch);
        if(ch=='a' || ch == 'A')
        {
            System.out.print("Addition is: "+(x+y));
        }
        else
        if(ch=='m' || ch=='M')
        {
            System.out.print("Multiplication is: "+(x*y));
        }
        else
        {
            System.out.print("Invalid Choice");
        }
       
        
    }
}
