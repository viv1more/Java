//Create an interface book with method void count(int d). Use the interface in class BookEx to display the count of books
interface book1
{
   public void count(int d);
}
class BookEx implements book1
{
    public void count (int x);
    {
        System.out.println(x);
    }
    public static void main(String[]args)
    {
        book1 b= new BookEx();
        b.count(10);
    }
    
}
