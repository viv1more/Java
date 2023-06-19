import java.io.*;

import java.util.*;



class slip101

{

    public static void main(String args[])

    {



        String fname=args[0];

	   Scanner sc=new Scanner(System.in);

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

                    System.out.println(s[i]);     

                }   

                else System.out.println("\n"+s[i]+" is a sub directory");

            }

            System.out.println("\nNumber of files are: "+num);

	    System.out.println("Are you want to delete a file : 1/0");

		int c=sc.nextInt();

		

		if(c==1)

		{

			System.out.println("List of files are : ");

           		String s1[] = f.list();

            		for(int i=0; i<s1.length; i++)

            		{			

                		File f1 = new File(fname, s[i]);

                		if(f1.isFile() && s1[i].endsWith(".txt"))

                		{

					f1.delete();

                    			System.out.println(s1[i] + " deleted");  num--;   

                		}   

				

                			

            		}

			 System.out.println("\nNumber of files are: "+num);

		}

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

            else System.out.println(fname+" file is not present ");

        }

    }

}

