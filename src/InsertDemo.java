import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,username,password);
        PreparedStatement ps = conn.prepareStatement("insert into student values(3,'Shyam',22,'NewRoad',98511),(4,'Gopal',25,'Maru',98611)");
        int i = ps.executeUpdate();
        if(i>0){
            System.out.println("Insert Succesfully..");
        }
        else {
            System.out.println("failed");
        }
    }
}
