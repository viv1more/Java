//print reverse numbers from n to 1
import java.util.*;
public class WhileEx2
{
    public static void main(String[] args)
   {
       Scanner p=new Scanner(System.in);
       System.out.println("Enter the value of n");

       int n= p.nextInt();
       int cnt=n;

       System.out.println("\n The Numbers are....\n");

       while(cnt>=1)
       {
           System.out.print(cnt+"\t");
           cnt--;
       }
   } 
}
