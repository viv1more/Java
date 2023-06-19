//Parameterized Constructor
public class Construct2 
{
    String name;
    int age;
    Construct2(String name,int age)//same as class name ->no argument constructor
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Student Name "+this.name+" \nStudent age is "+this.age);

    }
    public static void main(String[]args)
    {
        Construct2 obj=new Construct2("Vivek More",23);
        obj.display();
    }
    
}
