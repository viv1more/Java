//Create two interfaces that initialize a number
//use the interface in class "InterfaceEx" to implement the interface
//by initializing the numbers in the respective interface
interface number1
{
    int accept_number1();
}
interface number2
{
    int accept_number2();
}

class InterfaceEx implements number1,number2 
{
    public int accept_number1()//when implementing the interface
    {
        int x=10;
        return x;
    }
    public int accept_number2()//when implementing the interface
    {
        int x=19;
        return x;
    }
    public static void main(String[]args)
    {
        number1 e= new InterfaceEx();//reference variable
        number2 f= new InterfaceEx();

        System.out.println("Interface-1: "+e.accept_number1());
        System.out.println("Interface-2: "+f.accept_number2());
    }
    
}
