//Copy Constructor
public class CopyConst 
{
    String name;
    int age;
    CopyConst(String name,int age)//same as class name ->no argument constructor
    {
        this.name=name;
        this.age=age;
    }
    CopyConst(CopyConst t)
    {
        System.out.println("I am a copy constructor:"+ t.name);
    }
    void display()
    {
        System.out.println("Student Name "+this.name+" \nStudent age is "+this.age);

    }
    public static void main(String[]args)
    {
        CopyConst obj1=new CopyConst("Vivek More",23);//parameterized constructor
        CopyConst ob2= new CopyConst(obj1);//creates a copy constructor
        obj1.display();
        ob2.display();
    }
    
}
