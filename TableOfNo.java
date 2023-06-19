import java.util.*;  
public class TableOfNo  
{  
public static void main(String args[])   
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number to Print the Table: ");       

int n=sc.nextInt();  
System.out.print("Enter number limit to Table: ");       

int m=sc.nextInt();  
 
for(int v=1; v <=m; v++)  
{  
     
System.out.println(n+" * "+v+" = "+n*v);  
}  
}  
}  