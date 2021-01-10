/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author eliza
 */
public class Category {
    
    int id;
    String name, status;
    static String address = "Jl. Margona";
    
    public static void main(String[] arg){
        System.out.println("Hasil Perkalian Adalah : " + kalikan(3, 5));
        System.out.println("Hasil Bagi = " + bagikan(10, 2));
        address = "Jl. Cilodong";
    }
    
    static void penjumlahan(int x, int y) {
        print(x+y);
    }
    
    static void pengurangan(int x, int y) {
        print(x-y);
    }
    
    static void pembagian(int x, int y) {
        print(x/y);
    }
    
    static void perkalian(int x, int y) {
        print(x*y);
    }
    
    static void print(int hasil) {
        System.out.println("Hasilnya Adalah: " + hasil);
    }
    
    static int kalikan(int x, int y) {
        int kali = x * y;
        return x*y;
    }
    
    static int bagikan(int x, int y) {
        return x/y;
    }
}
