public class ques 
{
    String name;
    int age;
   // ques(String name,int age)//this is constructor same as class name
   void assign(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void student_details()
    {
        System.out.println("Name of Student= "+this.name);
        System.out.println("Age of Student= "+this.age);
    }
    
        public static void main(String[] args) 
    {
       ques obj=new ques();//("Vivek More",22);
        //obj.student_details();
       obj.assign("Guddu More", 22);
        obj.student_details();
    }
}
