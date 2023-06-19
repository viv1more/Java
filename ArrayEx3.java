import java.util.*;
class ArrayEx3 
{
 public static void main(String[]args)   
 {
     Scanner sc=new Scanner(System.in);
     
         System.out.print("Enter the Value N: ");
         int n=sc.nextInt();
         int [] a=new int [n];
         
         System.out.println("Enter the Numbers: ");
          for(int i=0;i<n;i++)
              a[i]=sc.nextInt();
           System.out.println("The array elements are:");
         for (int i=0;i<n;i++)
         
         System.out.println(a[i]);
       
 }
}
