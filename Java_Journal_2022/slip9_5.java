//implementing the IOException	
/*This exception occurs whenever an  input and output operation is failed or interpreted.
For instance: If you trying to read the file that does not exist.*/
import java.io.*;
import java.util.*;
class slip9_5
{
  public static void main(String [] args) throws IOException
  {  
     //read file using byte stream
     FileInputStream f = new FileInputStream("data.txt");
	 int c=0;
	 while(c!=-1)
	 {
	    c=f.read();
		System.out.print((char)c);
	 
	 }
	 System.out.println();
	 //read file using character stream
	 FileReader fr= new FileReader("data.txt");
	 int i =0;
	 while(i!=-1)
	 {
	    i=fr.read();
		System.out.print((char)i);
	 }
       fr.close();
  }
}
