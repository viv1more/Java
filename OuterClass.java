public class OuterClass
{
    void show()
    {//local inner class
        class localInnerClass
        {
            void display()
            {
                System.out.println("Hiii ! I am Local Inner Class");
            }
        }//end of inner class
    localInnerClass obj=new localInnerClass();
    obj.display();
    }//end of show
    public static void main(String[] args)
    {
        OuterClass ob=new OuterClass();
        ob.show();
    }
}

