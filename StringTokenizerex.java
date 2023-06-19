import java.util.*;
public class StringTokenizerex 
{
    public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    int i=0;
    System.out.println("Enter your Full name");
    String x=sc.nextLine();
    x.toLowerCase();
    StringTokenizer s=new StringTokenizer(x);
    String[] arr=new String[s.countTokens()];//gives the length to string used count Tokens
    while(s.hasMoreTokens())
    {
        arr[i]=(String)s.nextElement();
        i++;
    }
     //System.out.println(Arrays.toString(arr))
        String f= arr[0].substring(0,1).toUpperCase();
        String m= arr[1].substring(0,1).toUpperCase().concat(".");
        String l= arr[2].substring(0,1).toUpperCase();
        System.out.println(f+arr[0].substring(1)+" "+m+" "+l+arr[2].substring(1));
    }
}
