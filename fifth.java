class fifth
{
	int a=6;
	int square()
	{
		return(a*a);
	}
	 void cube()
	{
		System.out.println("The Cube is "+(a*a*a));
	}
	
public static void main(String[] args) 
	{
		fifth f=new fifth();
		System.out.println("The Square is "+f.square());
		f.cube();
	}
}
