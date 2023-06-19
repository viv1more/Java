import java.util.*;
public class CollectEx3 
{
    //addLast(element),getFirst(),getLast(),
    public static void main(String[] args)
    {
        LinkedList<String> a=new LinkedList<String>();
        LinkedList<String> b=new LinkedList<String>();
        a.add("Chalisgaon");
        a.add("Nashik");
        a.add("Pune");
        a.add("Jalgaon");
        a.add("Mumbai");
        System.out.println(a);

        Iterator<String> itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        a.addFirst("Amaravati");
        System.out.println(a);

        b=(LinkedList)a.clone();
        System.out.println(b);

        //a.clear();
      //  System.out.println(a.pollLast());
      System.out.println(a.peekLast());
        System.out.println(a);
    }
    
}
