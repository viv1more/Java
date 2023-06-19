//5)Create a class company with data members name and numbers of employess.Derive two class ITCompany
 // and Non-ITCompany. Display the necessary details.use constructor.
  //Slip5
  class Company
  {
     Company()
     {
       String name="Vivek";
       int no_of_emp=10;
      System.out.println("Name of Employee is:"+name);
       System.out.println("Numbers of employees are :"+no_of_emp);
     }
  }
    
   class ITCompany extends Company
   {  
      ITCompany()
    {
      String name1="Pratik";
       int no_of_emp1=20;
       System.out.println("Name of Employee is:"+name1);
       System.out.println("Numbers of employees are :"+no_of_emp1);
       }
   }
  
  class Non_ITCompany extends ITCompany
  {
      Non_ITCompany()
    {
       String name2="Shubham";
       int no_of_emp2=05;
       System.out.println("Name of Employee is:"+name2);
       System.out.println("Numbers of employees are :"+no_of_emp2);
       }
  }	 
  public class slip5
  {
    public static void main(String [] args)
    {
        //Company obj= new Company();
        //ITCompany obj1= new ITCompany();
        Non_ITCompany obj2= new Non_ITCompany();
        
    }
   
   }
  