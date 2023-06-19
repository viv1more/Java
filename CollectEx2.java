//add element in the arraylist and use set and remove methods
import java.util.*;
class CollectEx2
{
    public static void main(String [] args) 
    {
        ArrayList<String> a=new ArrayList<String>();
        a.add("Html");
        a.add(1,"");
        a.set(1, "ABC");
        a.add(2,"Java 2.0");

        System.out.println(a);
        a.remove("ABC");
        System.out.println(a);
    }
}