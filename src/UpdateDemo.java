import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
    public static void main(String[] args) throws  Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","");
       PreparedStatement ps =  conn.prepareStatement("update student set name='Gita' where id=2");
        ps.execute();
        System.out.println("Updated Successfully");

    }
}
