import java.util.*;
public class ArrayObject 
{
    String name=null;
    int age;
    public static void main(String []args)
    {
        ArrayObject[]s=new ArrayObject[10];//array of object
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println("Enter Record: "+i);
            s[i]=new ArrayObject(); //Assigns Space for name and age
            System.out.print("Name :");
            s[i].name=sc.next();
            System.out.print("Age: ");
            s[i].age=sc.nextInt();
        }
        System.out.println("The Records are ");
        
        for(int i=1;i<=n;i++)
        {
            System.out.println("Name= "+s[i].name+"Age= "+s[i].age);
        }
    }
}

