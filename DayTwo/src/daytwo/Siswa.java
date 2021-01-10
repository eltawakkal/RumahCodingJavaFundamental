
package daytwo;

public class Siswa {
    
    //properti
    private String name;
    
    Helper helper = new Helper();
    
    //constructer
    public Siswa() {
        
    }
    
    public Siswa(String name) {
        this.name = name;
    }
   
    
    public void printName() {
        helper.printText(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
