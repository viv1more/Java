/*Define a thread called "PrintTextThread" for printing text on command prompt for 'n' number of times. 
Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor.
Example:
a.    First thread prints "I am in FY" 10 times.
b.     Second thread prints "I am in SY" 20 times 
c.     Third thread prints "I am in TY" 30 times*/
import java.io.*;
import java.lang.*;
import java.lang.String.*;

class Ptext extends Thread
{
            String msg="";
            int  n;
            Ptext(String msg,int n)
            {
                this.msg=msg;
                this.n=n;
            }
            public void run()
            {
              try
              {     for(int i=1;i<=n;i++)
                   {
                       System.out.println(msg+" "+i+" times");
                   }
                       System.out.println("\n ");
              }
                     catch(ArrayIndexOutOfBoundsException e){}
            }
}
class slip13
{
            public static void main(String a[]) throws ArrayIndexOutOfBoundsException
            {
              int n=Integer.parseInt(a[0]);
              Ptext t1=new Ptext("I am in FY",n);
              t1.start();
              Ptext t2=new Ptext("I am in SY",n+10);
              t2.start();
              Ptext t3=new Ptext("I am in TY",n+20);
              t3.start();
            }
}
