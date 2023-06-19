 //Implementing arrayindexoutofboundException.
 //it is the exception which occurs when we try to phase array elements out of its length
 
 public class slip9_2
 {
     public static void main(String [] args)
	 {
       String [] names={"W","x","y","z"};
		  System.out.println(names[0]);
		  System.out.println(names[1]);
		  System.out.println(names[2]);
		  System.out.println(names[3]);
          System.out.println(names[4]);
		  for(int i=0;i<names.length;i++)
		  {
			  System.out.println(names[i]);
			  
		  }
	 }
 }   
