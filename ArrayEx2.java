class ArrayEx2
{
    public static void main(String []args)
    {
        String [] a= {"C++","html","java","php","code"};
        System.out.println("Array Length: "+a.length);
        System.out.println("First Element: "+a[0]);
        System.out.println("Middle Element: "+a[a.length/2]);
        System.out.println("Last value: "+a[a.length-1]);
       
        System.out.print("Array in Reverse Order:");
        for(int i=a.length-1; i>=0; i--)
        {
            System.out.print("\t"+a[i]);

        }
        
    }
}