//Accept an integer and display the name of the month. Repeatedly ask the user for the month choice and exit the loop if 0 is entered
import java.util.*;
public class ILLUSTR 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Choice: ");
        int a=sc.nextInt();
        
        switch(a)
        {
            case 1: System.out.print("The Month is January");
            break;
            case 2: System.out.print("The Month is February");
            break;
            case 3: System.out.print("The Month is March");
            break;
            case 4: System.out.print("The Month is April");
            break;
            case 5: System.out.print("The Month is May");
            break;
            case 6: System.out.print("The Month is June");
            break;
            case 7: System.out.print("The Month is July");
            break;
            case 8: System.out.print("The Month is August");
            break;
            case 9: System.out.print("The Month is September");
            break;
            case 10: System.out.print("The Month is October");
            break;
            case 11: System.out.print("The Month is November");
            break;
            case 12: System.out.print("The Month is December");
            break;
            case 0:System.out.print("The Month is Invalid");
            break;
            default:;
        }
    }
}
