public class AddMatrices 
{
    public static void main(String[]args)
    {
        int rows=2,columns=2;
        int [][] a={{2,3},{4,5}};
        int [][] b={{1,2},{2,3}};

        //Adding two matrices
        int [][] sum= new int [rows][columns];

        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                sum [i][j]=a[i][j]+b[i][j];
            }
        }
        //Display the Result
        System.out.println("Sum of two Matrices is: ");
        
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.println(sum [i][j]+"\t ");
            }
            System.out.println();
        }
        //Subtracting
        int [][] sub= new int [rows][columns];

        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                sub [i][j]=a[i][j]-b[i][j];
            }
        }
        //Display the Result
        System.out.println("Subtraction of two Matrices is: ");
        
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.println(sub [i][j]+"\t ");
            }
            System.out.println();
        }
        
    }
}
