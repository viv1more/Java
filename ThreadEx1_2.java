public class ThreadEx1_2 implements Runnable
{
   public void run()
   {
        System.out.println("\n\nThread is running...\n\n");
   }   
   public static void main(String[]args)
   {
       ThreadEx1_2 t1=new ThreadEx1_2();
       Thread t2= new Thread (t1);
       t2.start();
   }
}
