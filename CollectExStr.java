import java.util.*;
public class CollectExStr
//display the elements using arraylist 
{
    public static void main(String[]args)
    {
        ArrayList<String> a=new ArrayList<String>();
        a.add("Vivek");
        a.add("Pratik");
        a.add("Ajinkya");
        a.add("Chandrashekhar");
        a.add("Shubham");
        System.out.println(a);
        
        System.out.println("Number of Elements in the array : "+a.size());

        for(String str :a)
        {
            System.out.println(str);
        }
        System.out.println("Sorted Elements in an Array are : ");
        Collections.sort(a);
        System.out.println(a);
    }    
}
