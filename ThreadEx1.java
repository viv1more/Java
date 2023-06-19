 class ThreadEx1 extends Thread
 { 
     public void run()
    {
        System.out.println("\n\nThread is running...\n\n");
    }  
     public static void main(String[]args) 
     {
          ThreadEx1 t1=new ThreadEx1();
          System.out.print("\n\n"+t1);
          t1.start();
     }
 }