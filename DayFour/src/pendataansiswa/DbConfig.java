package pendataansiswa;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

public class DbConfig {
    
    private static String DATABASE_NAME = "dbSekolah";
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    private static String URL = "jdbc:mysql://localhost/" + DATABASE_NAME + "?useLegacyDatetimeCode=true";
//    private static String URL = "jdbc:mysql://localhost/" + DATABASE_NAME + "?serverTimezone=UTC";
    
    private static Connection connection;
    
    public static Connection getConnection() {
        
        if (connection == null) {
            try {
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setDatabaseName(DATABASE_NAME);
                dataSource.setUser(USERNAME);
                dataSource.setPassword(PASSWORD);
                dataSource.setUrl(URL);
                
                connection = dataSource.getConnection();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        
        return connection;
    }
    
}
