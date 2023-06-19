import java.io.*;
public class FileEx4 
{
    public static void main(String [] ags) throws IOException
    {
        // counts characters,words and lines in a file
        FileInputStream fileiN=new FileInputStream("data.txt");
        int val;char ch;
        int w=0,cnt=0,l=0;
        
        System.out.println("Content of the file is: ");
        while((val=fileiN.read())!=-1)
        {
            ch=((char)val);
            System.out.print(ch);
        if (ch==' ')
         
             w++;
              
           if (ch== '\n')
           
               l++;
              
           cnt++;
        }
        l++;
        
System.out.println("\n\nCharacters= "+(cnt-1)+"\n\nWords= "+(w+1)+"\n\nLines= "+(l));
    }
}
