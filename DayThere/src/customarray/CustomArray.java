package customarray;

import java.util.ArrayList;

public class CustomArray {

    public static void main(String[] args) {
        ArrayList<Siswa> listSiswa = new ArrayList();
        
        listSiswa.add(new Siswa(123, "Guna", false));
        listSiswa.add(new Siswa(456, "Steve", false));
        listSiswa.add(new Siswa(789, "Saddam", false));
        listSiswa.add(new Siswa(345, "Naufal", false));
        
        for(Siswa siswa : listSiswa) {
            System.out.println("Name : " + siswa.getName());
            System.out.println("Nim : " + siswa.getNim());
            System.out.println("Status : " + siswa.getStatus());
            System.out.println("==================================");
        }
    }
    
}
