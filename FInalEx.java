public class FInalEx 
{
 final int x;//final blank variable which is initialized an a constructor
 final int n=6;
 FInalEx()
 {
     x=8;//final variable initialized in constructor
 }
 public static void main(String[] args)
 {
     FInalEx b=new FInalEx();
     //f.x++; Can't Update the final variable
     System.out.println("\nFinal Variable value 1 : "+b.n);
     System.out.println("\nFinal Variable value 2 : "+b.x);
 }   
}















