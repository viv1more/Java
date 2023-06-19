import java.util.*;
public class ForQue 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String n=s.next();
        System.out.print("Enter the number n: ");
        int m=s.nextInt();
       // System.out.println("The "+m+" Times\n");
        for(int i=0;i<m;i++)//or for(int i=1;i<=m;i++)
        {
            System.out.println("\n"+n);
        }
    }
    
}
