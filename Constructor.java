//nonParameterized Constructor
public class Constructor 
{
    String name;
    int age;
    Constructor()//same as class name ->no argument constructor
    {
        name="Vivek";
        age=22;
    }
    void display()
    {
        System.out.println("Student Name "+name+" \nStudent age is "+age);

    }
    public static void main(String[]args)
    {
        Constructor obj=new Constructor();
        obj.display();
    }
    
}
