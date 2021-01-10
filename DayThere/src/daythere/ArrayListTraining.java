package daythere;

import java.util.ArrayList;

public class ArrayListTraining {

    public static void main(String[] args) {
        
        ArrayList<String> student = new ArrayList();
        String[] classes = new String[3];
        
        classes[0] = "Bisnis";
        classes[1] = "Marketing";
        classes[2] = "Deployment";
        
        classes[1] = null;
        
        student.add("Bisnis");
        student.add("Marketing");
        student.add("Marketing");
        student.add("Deployment");
        
        student.remove(1);
        
        for (String item : classes) {
            System.out.println(item);
        }
        
        System.out.println("==============================");
        
        for (String item : student) {
            System.out.println(item);
        }
        
//        System.out.println("Array Biasa Index : " + classes[0]);
//        System.out.println("Array List Index : " + student.get(0));
    }
    
}
