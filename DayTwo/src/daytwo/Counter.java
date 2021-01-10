
package daytwo;

public class Counter {
    
    Helper helper = new Helper();
    
    public void tambahkan(int x, int y) {
        helper.printText("Hasil Penjumlahan = " + (x+y));
    }
    
    // overloading
    public void tambahkan(int x, int y, int z) {
        helper.printText("Hasil Penjumlahan = " + (x+y+z));
    }
    
    public void tambahkan(boolean x, int y, int z) {
//        helper.printText("Hasil Penjumlahan = " + (x+y+z));
    }
    
    public void kurangi(int x, int y) {
       helper.printText("Hasil Pengurangan = " + (x-y));
    }
    
    public void kalikan(int x, int y) {
        helper.printText("Hasil Perkalian = " + (x*y));
    }
    
    public void bagikan(int x, int y) {
        helper.printText("Hasil Pembagian = " + (x/y));
    }
    
}
