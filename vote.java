public class vote 

{
   
    public void display(int age)
    {
    if (age>=18)
    System.out.println("Candidate is eligible to Vote");
    else
    {
    System.out.println("Candidate is not eligible to Vote");
    age=18-age;
    System.out.println("Age Diffference is "+age +" Year");
    }
    }
    public static void main(String[] args)
    
    {
        vote n=new vote();
        n.display(16);
        n.display(45);
      
    }
    
}
