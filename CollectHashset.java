import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class CollectHashset 
{
    public static void main(String [] args)
    {
    //Hashset donot allow duplicate values,but allows null elements to be strored
    HashSet<String> a=new HashSet<String>();
    HashSet<String> a1=new HashSet<String>();
    a.add("Vivek");
    a.add("Pratik");
    a.add("Pratik");
    a.add("Ajinkya");
    a.add("Chandrashekhar");
    a.add("Shubham");

    System.out.println(a);
    
   
    a.add("Ajinkya");//duplicate elements found and not added
    
    for(String str :a)
   
        System.out.println(str);
    
    if(a.contains("Pratik"))
    System.out.println("Duplicate element Found");
    else

    System.out.println("Not Found");
    
    a1 =(HashSet)a.clone();
    System.out.println(a);
    }    
}
