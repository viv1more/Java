import java.io.IOException;

public class StringEx4 
{
    public static void main(String [] args) throws IOException
    {
        String s="Java";
        System.out.println(s.concat(" Program"));
        String p=new String ("PHP");// string object is mutable (cannot be changed)
        System.out.println(p.concat(" Program")+" =" +p);

        StringBuffer b= new StringBuffer("HTML");//stringbuffer immutable (can be changed)
        System.out.println(b.append(" Script")+" ="+b);
        
        System.out.println(s.contains(" Program"));
        System.out.println(s.indexOf(" Script"));
    }   
}
