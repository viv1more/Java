//Q.. print alternate numbers from 1 to n..
import java.util.*;
public class Alternate 
{
  public static void main(String[] args)
  
  {
    Scanner t=new Scanner(System.in);
    System.out.println("Enter the Number n: ");
    int n=t.nextInt();
    int count=1;
    System.out.println("The Alternate Numbers are");
    while(count<=n)
    {
        System.out.print(count+"\t");
        count=count+2;
    }
  }   
}
