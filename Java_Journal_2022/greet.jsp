<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String name = request.getParameter("name");
   
   Calendar rightnow = Calendar.getInstance();
   int time = rightnow.get(Calendar.HOUR_OF_DAY);
  
    if(time > 0 && time <= 12)
    {
        out.println("Good Morning"+" "+name);
    }
      else if(time < 12 && time >=16)
      {
          out.println("Good Afternoon "+" "+name);
      }
      else
      {
          out.println("Good Night"+" "+name);
      }
%>

