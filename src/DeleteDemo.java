import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","");
        PreparedStatement ps = conn.prepareStatement("ALTER TABLE student Drop address");
        int result = ps.executeUpdate();

        if(result > 0){
            System.out.println(" A table is deleted");

        }else{
            System.out.println("Failed to Delete");
        }
        conn.close();
    }
}
