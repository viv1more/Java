import java.util.*;
public class StringSort 
{
    public static void main(String []args)
{
    //Sort alist of colors
    int n=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("How Many Colors: ");
    n=sc.nextInt();

    String[] s=new String[n];
    
    for (int i=0;i<n;i++)
    
        s[i]=sc.next();
        Arrays.sort(s);
        System.out.println("Sorted array is: ");
   
    for(String b:s)
    
        System.out.print("\t"+b);
  
}    
}
