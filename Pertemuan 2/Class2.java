/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
class Mahasiswa {
    String nama;
    int nim;

    // Konstruktor
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }
   
    
    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }
}

public class Class2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", 220001);
        Mahasiswa mhs2 = new Mahasiswa("Siti", 220002);

        // Menampilkan informasi mahasiswa
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
    }
}
