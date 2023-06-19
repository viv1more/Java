//Q Accept age and the loan amount. if the age is greater than 30 and loan amt is > 100000 message "Grant Loan"
//if age > 30 and Loan <100000 "Keep for Processing"
//if age < 30,or loan <10000 "Reject Loan
import java.util.*;
public class VIV1
{
    public static void main (String [] args0)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the Age: ");
        int age=s.nextInt();
        Scanner p= new Scanner(System.in);
        System.out.print("Enter the Loan Amount: ");
        int amount=p.nextInt();
        if(age>30 && amount >100000)
        {
            System.out.println("Approved");
            
            if(age >30 && amount<100000)
            System.out.println("Under Process");
           else
            if(age<30 || amount <100000)
            System.out.println("Reject Application");
            
        }
       
    }
    
}
