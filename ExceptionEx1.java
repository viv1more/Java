//generate a custom/user defined exception if the number >100
class MyNumber extends Exception
{
    public MyNumber(String s)
    {
        super(s);
    }
}
class ExceptionEx1
{
    public static void main(String []args)
    {
        int x=56;
        try{   //statements giving errors

            if(x>100)

            throw new MyNumber("Number Greater than 100 is not allowed");
            else
            System.out.println("The Number is accepted");
        }
        catch(MyNumber e)//this block handles exceptions
        {
            System.out.println(e.getMessage());
        }
    }
}
