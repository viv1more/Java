//method overriding when the base class and derived class method have same method name
class Check//parent class
{
    void ans()
    {
        System.out.println("Base class method");
    }
}  
class OverrideEX extends Check 
{
  void ans(int a, int b)
  {
      super.ans();//calls the base class ans() method
      System.out.println("Derived class method"+(a*b));
  }   
  public static void main(String[] args)
  {
      OverrideEX s= new OverrideEX();
      s.ans(5,6);//derived class method will be called
  }
}
