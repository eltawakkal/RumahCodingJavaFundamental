
package database;

import java.sql.Connection;

public class Database {

    static Connection connection;
    
    public static void main(String[] args) {
        connection = DbConfig.getConnection(); 
    }
    
}
