package pendataansiswa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DbHelper {
    
    Connection connection;
    JFrame root;

    public DbHelper(Connection connection, JFrame root) {
        this.connection = connection;
        this.root = root;
    }
    
    public ArrayList<Siswa> selectData() {
        ArrayList<Siswa> listSiswa = new ArrayList();
        
        String sql = "SELECT * FROM tbSiswa";
        
        Statement statement = null;
        
        try {
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(sql);
            
            while (result.next()) {
                String id = result.getString("id");
                String name = result.getString("name");
                String address = result.getString("address");
                
                System.out.println("Name: " + name);
                
                listSiswa.add(new Siswa(id, name, address));
            }
            
        } catch (Exception e) {
            System.err.println("Terjadi Kesalahan: " + e.getMessage());
        }
        
        return listSiswa;
    }
    
    
    public void insertData(String name, String address) {
        String sql = "INSERT INTO tbsiswa (name, address) VALUES (?, ?)";
        
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, name);
            statement.setString(2, address);
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(root, "Data Behasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(root, "Data Gagal Di Simpan");
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
    }
    
}
