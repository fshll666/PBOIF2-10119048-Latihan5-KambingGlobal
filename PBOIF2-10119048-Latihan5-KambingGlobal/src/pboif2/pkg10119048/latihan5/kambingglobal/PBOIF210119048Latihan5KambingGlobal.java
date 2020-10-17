/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan5.kambingglobal;

/**
 *
 * @author 
 * Nama      : Mochammad Faishal
 * Kelas     : IF2
 * NIM       : 10119048
 * Deskripsi : Menampilkan Jumlah Kambing
 */
public class PBOIF210119048Latihan5KambingGlobal {
    int jumlahKambing = 88;
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }  
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119048Latihan5KambingGlobal kambingSusu = new PBOIF210119048Latihan5KambingGlobal();
        
        kambingSusu.getJumlahKambing();
        
        kambingSusu.tambahKambing();
        
        kambingSusu.getJumlahKambing();
    }
    
}
