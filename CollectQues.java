//Search if "html" in the arraylist replace it with "PHP" else update "PHP" ata the end of arraylist
import java.util.*;
public class CollectQues 
{
    
        public static void main(String [] args) 
        {
            ArrayList<String> a=new ArrayList<String>();
            a.add("jklm");
            a.add(1,"");
            a.set(1, "ABC");
            a.add(2,"Java 2.0");
            
            System.out.println(a);
            a.remove("ABC");
            System.out.println(a);

            int s=a.size();
            s--;
            if(a.contains("Html"))
            {
              int ind=a.indexOf("Html");
              a.set(ind, "PHP");
              System.out.println("Element Found.. Updated List "+a);
            }
            else
            {
                a.set(s, "PHP");
                System.out.println("Element Not Found.. Updated List "+a);
            }
        
        }
      
}
