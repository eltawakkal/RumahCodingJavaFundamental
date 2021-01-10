
package dayone;

public class Logic {
    
    public static void main(String[] args) {
        login("sample@gmail.co.id", "1234");
        penilaian(65);
        switchGender(2);
    }
    
    static void login(String email, String password) {
        
        if (email.equals("sample@gmail.com") && password.equals("123")) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Login Gagal");
        }
        
        
    }
    
    static void penilaian(int score) {
        
        if (score <= 75) {
           System.out.println("Score anda C");
        } else if (score > 75 && score <= 85) {
           System.out.println("Score anda B");
        } else {
           System.out.println("Score anda A");
        }
        
    }
    
    static void switchGender (int gender) {
        switch(gender) {
            case 1:
                System.out.println("Laki-laki");
                break;
            case 2:
                System.err.println("Perempuan");
                break;
        }        
        
    }
    
}
