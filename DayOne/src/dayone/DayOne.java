
package dayone;

public class DayOne {
    
    String schoolName;
    
    void fungsiTest() {
        String schoolNames = "local";
        
        schoolName = "ubah";
        schoolNames = "ubah Lokal";
    }
    
    void fungsiLain() {
        schoolName = "Ubah Lagi";
        String schooolAddress = "Jl";
        
        fungsiTest();
    }
    
    public static void main() {        
        int nilaiStandard = 745;
        int score = 76;
        double hasil = nilaiStandard / score;
        
        System.out.println("Hasil Penambahan " + hasil);
    }
    
}
