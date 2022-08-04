import java.sql.Connection;
import java.sql.DriverManager;

public class DbFunctions {
    public Connection connect_to_db(String dbname, String user, String password) {
        // connect to db
        Connection conn = null;
        try {
           Class.forName("org.postgresql.Driver");
           conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres"+dbname, "postgres", "postgres");
           if (conn!= null) {
               System.out.println("Connected to the database");
           } else {
               System.out.println("Failed to make connection to database");
           }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;

    }
}
