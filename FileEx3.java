import java.io.*;
public class FileEx3 
{
    public static void main (String[]args)
    {
        File d=new File("C://Users//Lenovo//Desktop//Java");
        //get all the filesfrom the directory
        File[] fList=d.listFiles();
        for(File f: fList)
        {
            System.out.println(f.getName());
        }
    }   
}
