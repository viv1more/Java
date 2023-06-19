public class Test 
{
  static int i=15;
    static class NestedTest
    {
        public static void printer()
        {
            System.out.println("The Value of i is "+i);
        }
    }   



    public static void main(String[] args)
{
    Test.NestedTest.printer();
}
}