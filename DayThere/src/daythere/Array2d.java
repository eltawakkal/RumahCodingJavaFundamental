
package daythere;

public class Array2d {
    
    public static void main(String[] args) {
        String[][] names = {{"Saddam", "Naufal", "Lisa"}, {"Steve", "Gunna"}};
//        System.out.println(names[1].length);

        String[] classes = {"Bisnis", "Marketing", "Deploymen"};
        
//        for (int i = 0; i < names.length; i++) {
//            for (int j = 0; j < names[i].length; j++) {
//                System.out.println("Name : " + names[i][j]);
//            }
//        }
        
//        for (int i = 0; i < classes.length; i++) {
//            System.out.println(classes[i]);
//        }
        
        for (String kelas : classes) {
            System.out.println(kelas);
        }
    }
    
}
