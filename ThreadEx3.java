public class ThreadEx3 extends Thread
{
    public ThreadEx3(String str)
    {
        super(str);//dont need to create object of base class
        start();//

    }
    public void run()
    {
        System.out.println("Thread Name : "+getName());
        System.out.println("Thread ID : "+getId());
    }
    public static void main(String args[])
    {
        new ThreadEx3("Vivek");
        new ThreadEx3("MCA");
    }
}
