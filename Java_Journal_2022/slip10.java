/*Write a program to accept a string as command line argument and check whether it is a file
or directory. Also perform operations as follows: 
a) If it is a directory, list the names of text file. Also, display a count showing the number of files in the directory. 
b) If it is a file display various details of that file.*/
import java.io.*;
import java.lang.*;

class slip10    
{
   public static void main(String a[]) 
   {

       String fname=a[0];
        File f = new File(fname);
    int num=0;
   if(f.isDirectory())
    {
       System.out.println("Given file "+fname+"is  directory :");
       System.out.println("List of files are : ");
       String s[] = f.list();
      for(int i=0; i<s.length; i++)
          {
              File f1 = new File(fname, s[i]);
            if(f1.isFile())
            {
                  num++;
               System.out.println(s[i]);               //file name in directory
            }             
              else
               System.out.println("\n"+s[i]+" is a sub directory");
         }
            System.out.println("\nNumber of files are: "+num);
   }
            else
       {
               if(f.exists())
                  {
                      System.out.println("\n"+fname+" is a File");
                      System.out.println("Details of "+fname+" are : ");
                      System.out.println("Path of file is "+f.getPath());
                      System.out.println("Absolute Path of file is "+f.getAbsolutePath());
                      System.out.println("Size of file is "+f.length());
                   }
                     else 
                     System.out.println(fname+" file is not present ");
         }
   }
}