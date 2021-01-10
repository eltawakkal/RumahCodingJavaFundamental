
package database;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

public class DbConfig {
    
    private static String DATABASE_NAME = "ss";
    private static String USER = "root";
    private static String PASS = "";
    private static String URL = "jdbc:mysql://localhost/" + DATABASE_NAME;
    
    private static Connection connection;
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setUrl(URL);
                dataSource.setUser(USER);
                dataSource.setPassword(PASS);
                connection = dataSource.getConnection();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        
        return connection;
    }
}
