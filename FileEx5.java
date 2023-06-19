import java.io.*;
public class FileEx5 
{
  public static void main(String[]nbn )throws IOException,FileNotFoundException
{
    FileReader fr=new FileReader("data.txt");

    BufferedReader br1= new BufferedReader(fr);

    String n; int flag=0;
     while((n=br1.readLine())!=null)
     {
        if (n.contains("hhh"))
        {
            System.out.println("\nFound\n");
            flag++;
            break;
        }
     }
     if (flag==0)
     {
         System.out.println("\nNot Found\n");
         br1.close();
     }
}   
}
