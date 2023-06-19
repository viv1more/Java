public class TypeCast 
{
    public static void main(String [] args)
    {
        int a=5;
        float b;
        b=a;//implicit type casting
        System.out.println("\nWidening or Implicit type casting "+b);
        
        int v1;
        float v2=87.2434f;
        v1=(int)v2;//explicit type casting
        System.out.println("\nNarrowing or Explicit type casting "+v1);
    }
    
}
