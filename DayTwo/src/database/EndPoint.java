
package database;

public class EndPoint {
    
    void insertData(String name, String hp, String address) {
        String sql = "INSERT INTO tb_siswa (name, hp, address) VALUES ('hendro', '0812', 'Jl. Polonia Barat')";
    }
    
    void updateData() {
        String sql = "UPDATE tb_siswa SET name = 'Edited', hp = '0888888', address = 'address edited' WHERE id = '2'";
    }
    
    void deleteData() {
        String sql = "DELETE FROM tb_siswa WHERE id = 2";
    }
    
    void selectData(String id) {
        String sql = "SELECT * FROM tb_siswa WHERE id = 1";
    }
    
    void selectAllData() {
        String sql = "SELECT * FROM tb_siswa WHERE id = 1";
    }
    
    void searchData(String search) {
        String sql = "SELECT * FROM tb_siswa WHERE name LIKE '%a%'";
    }
    
}
