import java.util.*;
public class CollectEx 
{
    public static void main(String[]args)
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(23);
        a.add(35);
        a.add(26);
        System.out.println(a);
        Iterator i= (Iterator)a.iterator();
        while(i.hasNext())
        {
            int x=(int ) i.next(); // i.next() returns Integer
            System.out.println(x);

        }
    }    
}
