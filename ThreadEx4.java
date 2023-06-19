public class ThreadEx4 extends Thread
{
   String name;Thread t;
   public ThreadEx4(String str)
   {
       name=str;
       start();
   } 
   public void run()
   {
        try{
            for(int i=10;i<15;i++)
            {
                System.out.println(name+" Value="+i+"\n\n");
                sleep(1200);
            }
        }
        catch(InterruptedException e){}
   }
   public static void main(String []args)
   {
        ThreadEx4 t1=new ThreadEx4("One");
         ThreadEx4 t2= new ThreadEx4("Two");
         ThreadEx4 t3=new ThreadEx4("Three");
         ThreadEx4 t4= new ThreadEx4("Four");
   }
}
