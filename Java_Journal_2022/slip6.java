/*6)Create a class   School with data members name and area.Derive a class School-one from School that displays
the name and area. Derive another class from School- two that displays the name and area. */

import java.util.*;

class School
{
   Scanner sc = new Scanner(System.in);
   String name;
   String area;
   void show()// we could not acceses the methods and variables from superclass if we declare it as priavte.
   {
      System.out.print("Enter Name:");
	  name = sc.next();
	  System.out.print("Enter Area:");
	  area = sc.next();
   
   }
}
 class One extends School
 {
    void display()
	{
	  System.out.println("Name of School 1: "+name);
	  System.out.println("Area of School 1: "+area);
	  
	}
 }
  class Two extends School
 {
    void display()
	{
	  System.out.println("Name of School 2: "+name);
	  System.out.println("Area of School 2: "+area);
	  
	}
 }
 class slip6
 {
    public static void main(String [] args)
	{
	   One a=new One();
	   Two b=new Two();
	   
	   a.show();//accesing method of base class
	   a.display();
	   
	   b.show();
	   b.display();
	}
 
 }
