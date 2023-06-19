import java.io.*;
public class File3Del
{
     //List the files from the directory
    public static void main (String[]args)
    {
        File d=new File("C://Users//Lenovo//Desktop//Java");
       File[] fList=
    
        for()
      
        //delete specific extension files
        if(d.isFile())
        {
        String s=d.toString();
        int ind=s.indexOf(".");
        if(s.substring(ind,s.length()).equals(".txt"))
            d.delete();
        }
    }   
}
