/*1)Create an abstract class Vehicle with a member variable no-of-passengers and a member function Check()
 that displays the number of passengers.Create two subclasses Car and Bus thats extends abstract class. 
 Display the number of passengers for Car and Bus.*/

 import java.util.*;
 abstract class Vehicle
 {
	 int no_of_passenger;
	 abstract int Check(); 
 }
 
 class Car extends Vehicle
 {
	public int Check() 
	{
       	 int no_of_passenger= 30;   
          return no_of_passenger;		 
	} 
 }
 
 class Bus extends Vehicle
 {
	public int Check() 
	{
   		 int no_of_passenger=40;	
		return no_of_passenger;
	} 
 }  
   
abstract class slip1
  {
	public static void main(String [] args)
	{
     Vehicle v;
	 v = new Car();
	 System.out.println("Number of passengers are:"+v.Check());
	 v = new Bus();
	 System.out.println("Number of passengers are:"+v.Check());
	 
     }
 
 }
