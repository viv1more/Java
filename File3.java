import java.io.*;
public class File3
{
     //List the files from the directory
    public static void main (String[]args)
    {
        File d=new File("C://Users//Lenovo//Desktop//Java");
        //get specific extension files from the directory
        String filenames[]=d.list();
        for(String f1:filenames)
        {
            if(f1.endsWith(".bak"))
            System.out.println("\n"+f1);
        }
    }   
}
