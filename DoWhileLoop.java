import java.util.*;
public class DoWhileLoop
{   
     public static void main(String[] args) 
    {  
           
        Scanner sc=new Scanner(System.in);
        char ch;
            System.out.print("Enter Character: ");
        ch= sc.next().charAt(0);

        do
        {
            System.out.print("Enter Number First: ");
            int x=sc.nextInt();
        
            System.out.print("Enter Number Second: ");
            int y=sc.nextInt();

            System.out.print("The Character is: "+ch);
        
       switch(ch)
            { 
            case 'a':
            case 'A':
             System.out.print("\nAddition is: "+(x+y));
                break;

            case 'm':
            case 'M':
                System.out.print("\nMultiplication is: "+(x*y));
             break;

                default:
                System.out.print("\nInvalid Choice");
            }
                System.out.println("\nPlease Continue...or type 'x' for exit");
                ch=sc.next().charAt(0);//Choice of 'a' 'm' 'A' 'M' or 'X'
        }
        while(ch!='x');
    }
}