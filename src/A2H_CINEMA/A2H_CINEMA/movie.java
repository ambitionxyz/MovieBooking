package A2H_CINEMA;
import java.sql.*;
public class movie
{
public static String movienm;
public static String rating;
public static int screen;
public static String rdate;
public static Statement st;
public static Connection con;
public static ResultSet rs;
public static String sc;
public static int sht;
public static String sdt;
public static int ic;
public static void conn()
{
  try
  {
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
     st=con.createStatement();
  }
  catch(Exception e){System.out.print(e.getMessage());}
}
movie(String mnm,String rat,int scr, String rdt)
{
  movienm=mnm;
  rating=rat;
  screen=scr;
  rdate=rdt;
}
}
