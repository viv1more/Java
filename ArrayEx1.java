class ArrayEx1
{
    public static void main(String []args)
    {
        int [] a= {2,3,4,5};
        System.out.println("Array Length: "+a.length);
        System.out.println("First Value: "+a[0]);
        System.out.println("Last Value:" +a[3]);
        System.out.println("Last value: "+a[a.length-1]);

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);

        }
        
    }
}