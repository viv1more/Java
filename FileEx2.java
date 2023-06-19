import java.io.*;
import java.util.*;
public class FileEx2 
{
    public static void main(String [] args) throws IOException 
    {
        //write contents to a file
        FileWriter fr=new FileWriter("data.txt",true);
        fr.write("\njava program");
        fr.close();

        //copy contents of one file to another
        BufferedReader fr1= new BufferedReader(new FileReader("data.txt"));
        FileWriter fw=new FileWriter("chk.txt");
        String s="";
        while(fr1.ready())
        {
            s=s+fr1.readLine()+"\n";
            fr.close();;
            fw.write(s);
            fw.close();;
        }

    }
}   
