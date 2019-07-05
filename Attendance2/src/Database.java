
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
  
    Connection conn = null;
    String user = "root";
    String password = "Kingui"; 
    String url = "jdbc:mysql://localhost/attendance?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public Connection getConnection() {
        
       try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            System.out.println("Databse Error : "+e);
        }
        return conn;
    }
    

}

