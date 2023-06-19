//Constructor Overloading
public class ConstructOvd
{
    String name;
    int age;
    //When multiple consturctors are used then it is called as constructor overloading
    ConstructOvd(String name,int age)//same as class name ->no argument constructor
    {
        this.name=name;
        this.age=age;
    }
    ConstructOvd()//overloading
    {
        this("Vivek Ashok More",21);
        System.out.println("Its Non Parameterized Constructor");
    }
    void display()
    {
        System.out.println("Student Name: "+this.name+" \nStudent age is "+this.age);

    }
    public static void main(String[]args)
    {
        //ConstructOvd obj=new ConstructOvd("Vivek More",23);
        ConstructOvd obj2=new ConstructOvd();//no argument 
        //obj.display();
        obj2.display();
    }
    
}
