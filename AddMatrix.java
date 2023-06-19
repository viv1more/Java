import java.util.*;
public class AddMatrix 
{
    static void input(int a[][],int b[][])
    {
        System.out.println("Sum of Two matrices");
        for (int i=0;i<2;i++)
        {
            for (int j=0;i<2;j++)
            {
                System.out.print(a[i][j]+b[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String []args)
    {
        int rows =2,columns=2;
        Scanner sc=new Scanner(System.in);

        int [][]a= new int[2][2];
        int [][]b=new int[2][2];

        System.out.println("Enter the Values for Matrix-1: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
            System.out.println("Enter the Values for Matrix-2: ");
    
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
       
            input(a, b);
        }
    }

