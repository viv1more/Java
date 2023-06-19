import java.io.*;
import java.util.*;
public class FileExx5 
{
    public static void main (String args[]) throws IOException
    {
        try
        {
            FileReader fr= new FileReader("data.txt");
            BufferedReader br1= new BufferedReader(fr);
            BufferedReader br2= new BufferedReader(new FileReader("chk.txt"));
            FileWriter br3=new FileWriter("third.txt",true);

            String n;
            while ((n=br1.readLine())!=null)
                    br3.write(n+"\n");
             while ((n=br2.readLine())!=null)
                    br3.write(n+"\n");
                    br3.write("sd");
                    br3.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File name not found");
        }
        catch(IOException e)
        {
            System.out.println("File name not found");
        }

    }

    
 }
