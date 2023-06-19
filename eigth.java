public class eigth
 {
     public int sq(int x)
     {
        return(x*x);
     
     }
     public void cube (int y)//y will be storing 4
     {
        System.out.println("Cube= "+(y*y*y));
     
     }
     public static void main(String[] args)
     {
         eigth s= new eigth();
         int n=s.sq(2);
         System.out.println("Sqaure= "+n);
         s.cube(n);//cube of 4 .......control goes to line8
     }

    
}
