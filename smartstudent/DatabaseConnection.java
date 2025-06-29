import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/smartstudent_db";
    private static final String USER = "root";
    private static final String PASSWORD = "meghana@2003";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Get connection
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
