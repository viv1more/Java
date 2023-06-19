//Anonymous inner class

public class OuterClass1
{
	public static void main(String args[])
	{
		SomeClass obj=new SomeClass()
		{
			void display()
			{
				System.out.println("Hi!!!! I am anonymous inner class");
				
			};
        };
			obj.display();
		
	}

}	
class SomeClass
{
	void display()
	{
		System.out.println("Hi!! I am real one");
	}
}
