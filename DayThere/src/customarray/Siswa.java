package customarray;

public class Siswa {
    
    private int nim;
    private String name;
    private boolean status;

    public Siswa(int nim, String name, boolean status) {
        this.nim = nim;
        this.name = name;
        this.status = status;
    }
    
    

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
