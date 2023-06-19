/*Write a java program to merge two files in a third file.
Display the contents of all the three
files */
  
import java.io.*;
  
class slip11 
    
 
{
    public static void main(String[] args) throws IOException 
    {
        
        // PrintWriter object for file3.txt
        PrintWriter pw = new PrintWriter("file3.txt");
        
        // BufferedReader object for file1.txt
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
          
        String line = br.readLine();
          
        // loop to copy each line of 
        // file1.txt to  file3.txt
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
          
           br = new BufferedReader(new FileReader("file2.txt"));
          
        line = br.readLine();
          
        // loop to copy each line of 
        // file2.txt to  file3.txt
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
          
        pw.flush();
       
          
        // closing resources
        br.close();
        pw.close();
      
          
        System.out.println("\nMerged file1.txt and file2.txt into file3.txt");

        System.out.print("\nContents of File1\n:");
        FileReader fr=new FileReader("file1.txt");
        int i=0;
        while(i!=-1)
        {
            i=fr.read();
            System.out.print((char)i);
        }
        fr.close();

        System.out.print("\nContents of File2\n:");
         fr=new FileReader("file2.txt");
         i=0;
        while(i!=-1)
        {
            i=fr.read();
            System.out.print((char)i);
        }
        fr.close();

        System.out.print("\nContents of File3\n:");
        fr=new FileReader("file3.txt");
        i=0;
        while(i!=-1)
        {
            i=fr.read();
            System.out.print((char)i);
        }
        fr.close();
    }
}