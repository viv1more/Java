class fourth
{	
	int a=5;
	int b=6;
	public void addition()
	{
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
	public int multiplication()
	{
		return(a*b);
	}
	public static void main(String[] args) 
	{	
		fourth s = new fourth();
		s.addition();
		System.out.println("Multiplication of "+s.a+" and "+s.b+" is "+s.multiplication());
	}
	
}
