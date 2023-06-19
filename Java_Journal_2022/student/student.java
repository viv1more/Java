package student;
import java.sql.*;
public class student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try 
    {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from student");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
            con.close();
        }
    }catch(SQLException e){System.out.println(e);}
    }

}
