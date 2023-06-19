//print numbers from 1 to n..
import java.util.*;
public class WhileEx 
{
    public static void main(String[] args)
   {
       Scanner p=new Scanner(System.in);
       System.out.println("Enter the value of n");

       int n= p.nextInt();
       int cnt=1;

       System.out.println("\n The Numbers are....\n");
       
       while(cnt<=n)
       {
           System.out.print(cnt+"\t");
           cnt++;
       }
   } 
}
