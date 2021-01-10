
package daythere;

import java.util.Scanner;

public class InputError {
    
    public static void main(String[] args) {
        
        
        int age = 0;
        boolean isError = false;
        
        while(age == 0) {
            try {
                Scanner scanner = new Scanner(System.in);
                
                if (!isError) {
                    System.out.println("Masukkan Umur: ");
                } else {
                    System.out.println("Masukkan Kembali Umur Anda: ");
                }
                
                
                age = scanner.nextInt();
                
            } catch (Exception err) {
                isError = true;
                System.err.println("Invalid Input");
                age = 0;
            }
        }
        
        System.out.println("Umur Anda: " + age);
        
    }
    
}
