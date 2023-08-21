import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDataDemo {
    public static void main(String[] args) throws  Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","");
        PreparedStatement ps = conn.prepareStatement("select * from student");
        ResultSet rs = ps.executeQuery();

        while(rs.next())
        {
          String id =  rs.getString("id");
            System.out.println(id);
            String name =  rs.getString("name");
            System.out.println(name);
            String age =  rs.getString("age");
            System.out.println(age);
            String phoneno =  rs.getString("phoneno");
            System.out.println(phoneno);
        }
    }
}
