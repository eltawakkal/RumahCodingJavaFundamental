
package daythere;

import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = {"Randy", "Gaga", "Viny"};
        String[] classes = new String[3];
        
        for(int i=0; i < classes.length; i++) {
            System.out.println("Masukkan Kelas ke " + (i+1));
            classes[i] = scanner.nextLine();
        }
        
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
   
    }
    
}
