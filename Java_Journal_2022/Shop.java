/*Create interface for MyPay. Initialize a variable with a minimum amount and a member function
increase() that balance by 1000.Create a class Shop that Implements the above interface.*/

interface MyPay
{
    int x = 50;
    int increase();

}
class Shop implements MyPay
{
   public int increase()
   { 
     
     int cnt = 0;
      cnt = x+1000;
	  return cnt;
   }
   public static void main(String [] args)
   {
       MyPay m = new Shop();
       System.out.println("Initial Value of x is:"+x);
	   System.out.println("increased value of x is:"+m.increase());
   
   }
}
