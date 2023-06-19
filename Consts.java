class Consts

{
    String name;
    int age;

     void assign (String name,int age)
    {
        this.name=name;
        this.age=age;

    }
     void display()
    {
        System.out.println("Student name:"+this.name+"Student age:"+this.age);
    }
public static void main(String[]args){
        Consts t=new Consts();
        t.assign("Pratik",21);
        t.display();
    }

    }