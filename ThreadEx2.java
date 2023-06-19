public class ThreadEx2 implements Runnable 
{
    public void run()
    {
        try{
            for (int i=0;i<=7;i++)
            {
                System.out.println("Value = "+i+"\n");
                Thread.sleep(400);//time in miliseconds
            }
        }
        catch(InterruptedException e)
        { }
    }
    public static void main(String[] args)
    {
        ThreadEx2 t1=new ThreadEx2();
        Thread t2 =new Thread(t1);
        t2.start();
    }
}
