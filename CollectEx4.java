import java.util.*;
public class CollectEx4 

{
    public static void main(String[]args)
    {
        LinkedList<String> a=new LinkedList<String>();
        
        a.add("Chalisgaon");
        a.add("Nashik");
        a.add("Pune");
        a.add("Jalgaon");
        a.add("Mumbai");

       //wrong- System.out.println(a.addFirst("Chennai"));
          a.addFirst("Chennai");
          System.out.println(a.offerFirst("SSD"));
          System.out.println(a);

    }
}
