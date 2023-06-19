public class addintfl 
{
 
    void add(int a,int b)
    {
        System.out.println("\nAddition of Integers "+(a+b));
    }
    void add(float c, float d)
    {
        System.out.println("\nAddition of Float Numbers "+(c+d));
    }
     public static void main(String[] args) 
     {
        addintfl n=new addintfl();
        n.add(13,34);
        n.add(12.36f,96.36f);
    }
}
