import java.util.*;
import java.io.*;
public class FilleEx1 
{


    public static void main(String args[]) throws IOException 
    {
     // read file using byte stream

     FileInputStream f= new FileInputStream("data.txt");
        int c=0;
        while(c!=-1)
        {
            c=f.read();
            System.out.print((char)c);
        }
        //read file using character stream
        FileReader fr=new FileReader("data.txt");
        int i=0;
        while(i!=-1)
        {
            i=fr.read();
            System.out.print((char)i);
        }
        fr.close();
    }
}
