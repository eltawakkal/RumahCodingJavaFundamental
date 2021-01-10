package customarray;

import java.util.ArrayList;

public class Challenge {
    
    public static void main(String[] args) {
        String[][] names = {
            {"Randy", "Lisa"}, 
            {"Rangga", "Bayu"}, 
            {"Jira", "Malik"}
        };
        
        int a = 11;
        int b = 5;
        int c = -12;
        int hasil = a+b+c;
        
        System.out.println(hasil);
        
        
        int[][] nimStatus = {{234, 70}, {864, 85}, {983, 60}};
        
        ArrayList<Siswa> listSiswa = new ArrayList();
        
        for (int i = 0; i < names.length; i++) {
            listSiswa.add(new Siswa(
                    nimStatus[i][0], 
                    names[i][0], 
                    checkNilai(nimStatus[i][1])
            ));
        }
        
        for(Siswa siswa : listSiswa) {
            System.out.println("Name : " + siswa.getName());
            System.out.println("Nim : " + siswa.getNim());
            String status = siswa.getStatus() ? "Lulus" : "Tidak Lulus";
            System.out.println("Status : " + status);
            System.out.println("===================================");
        }
    }
    
    static boolean checkNilai(int score) {       
        return score >= 70;
    }
}
