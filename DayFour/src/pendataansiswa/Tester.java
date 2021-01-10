
package pendataansiswa;

import java.sql.Connection;

public class Tester {
    
    static Connection connection;
    static DbHelper helper;
    
    public static void main(String[] args) {
        connection = DbConfig.getConnection();
//        helper = new DbHelper(connection);
        
        helper.insertData("Fatur", "Kali Malang");
    }
    
}
