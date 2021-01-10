package daytwo;

import java.util.ArrayList;
import java.util.List;

public class DayTwo {

    public static void main(String[] args) {
        String age = String.valueOf(20);
        
        // membuat object helper
        Helper helper = new Helper();
        
        helper.printText("Umur : " + age);
        helper.printText("==============================");
        
        Counter counter = new Counter();
        counter.tambahkan(3, 5);
        counter.tambahkan(3, 5, 6);
        counter.kurangi(10, 3);
        counter.kalikan(5, 3);
        counter.bagikan(30, 3);
        
        Siswa siswa = new Siswa("gani");
        siswa.printName();
        siswa.setName("Selvi");
        siswa.printName();
        siswa.setName("Rangga");
        siswa.printName();
        
        helper.printText("Nama siswa : " + siswa.getName());
        
        iterateWhile();
        sampleArray();
        perkalianIteration();
    }
    
    static void iterateWhile() {
        int i = 10;
        
        while (i >= 0) {
            
//            if (i == 10 || i == 7 || i == 3) {
//                System.out.println("iterasi ke : " + i);
//            }

            System.out.println("iterasi ke : " + i);

            if (i==7) {
               break;
            }
                   
            i--;
        }
    }
    
    static void sampleArray() {
        String name = "jarul";
        
        String[] names = {"jarul", "Rangga", "Adit"};
        int numbers[] = {2, 5, 9, 3};
        
//        System.out.println("Nama: " + names[0]);

        int hasil = 0;

        for(int i=0; i<numbers.length; i++) {
//            System.out.println("Nama: " + names[i]);
            hasil += numbers[i];
        }
        
        System.out.println("hasil: " + hasil);
    }
    
    static void perkalianIteration() {
        
        List<List<Integer>> arr = new ArrayList();
//        
//        
//        
//        for (int i=1; i<=10; i++) {
//            System.out.println("Perkalian 2 x " + i + " = " + (2*i));
//        }

        
        List<Integer> row1 = new ArrayList();
        List<Integer> row2 = new ArrayList();
        List<Integer> row3 = new ArrayList();
        List<Integer> row4 = new ArrayList();
        
        row1.add(3);
        
        row2.add(11);
        row2.add(2);
        row2.add(4);
        
        row3.add(4);
        row3.add(5);
        row3.add(6);
        
        row4.add(10);
        row4.add(8);
        row4.add(-12);
        
        arr.add(row1);
        arr.add(row2);
        arr.add(row3);
        arr.add(row4);
        
        for(int i=1; i<arr.size(); i++) {
            for(int j=i; j<1; j++) {
                System.out.println(arr.get(i).get(j));
            }
        }

    }
    
}
