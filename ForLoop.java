//demonstration of for loop
import java.util.*;
public class ForLoop 
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print ("Enter the number n:");
    int n=sc.nextInt();

    System.out.print("\n The Numbers in Sequence..\n");
    for(int i=1;i<=n;i++)
        System.out.print(i+"\t");

        System.out.print("\n\nThe Numbers in Reverse Sequence\n");
    for(int i=n;i>=1;i--)
        System.out.print(i+"\t");
       
        System.out.print("\n\nThe Numbers in Alternate Sequence\n");
    for(int i=1;i<=n;i+=2)
        System.out.print(i+"\t");
    
}
}
