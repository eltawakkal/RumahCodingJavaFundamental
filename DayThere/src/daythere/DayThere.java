package daythere;

import java.util.Scanner;

public class DayThere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int age = 0;
        boolean status;
        
        try {
            System.out.println("Masukkan Nama: ");
            name = scanner.nextLine();

            System.out.println("Masukkan Umur");
            age = scanner.nextInt();
            
            System.out.println("Masukkan Status");
            status = scanner.nextBoolean();

            System.out.println("Nama Anda : " + name);
            System.out.println("Umur Anda : " + age);

            String convertedStatus;

            if (status) {
                convertedStatus = "Lulus";
            } else {
                convertedStatus = "Tidak Lulus";
            }

            System.out.println("Status Anda : " + convertedStatus);
            
        } catch (Exception error) {
            System.err.println("Invalid Input: " + error);
        }
        
    }
    
}
