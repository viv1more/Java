import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
//javax will not work in tomcat 10 replace with jakarta also add classpath while compiling
//javac -classpath <classpath> <programname>.java
//javac -classpath servlet-api.jar VisitServlet.java
public class VisitServlet extends HttpServlet
{
  static int i=1;
  public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      String k=String.valueOf(i);
      Cookie c=new Cookie("visit",k);
      response.addCookie(c);
      int j=Integer.parseInt(c.getValue());
      if(j==1)
      {
          out.println("Welcome to web page ");
      }
      else        {
          out.println("You are visited at "+i+" times");
      }
      i++;
  }
}

