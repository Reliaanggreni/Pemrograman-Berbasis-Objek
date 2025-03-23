/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
    class Mahasiswa {
        private String nama;
        private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        }
    public String getNama() {
        return nama;
        }
    public int getUmur() {
        return umur;
        }

    public void setNama(String nama) {
        this.nama = nama;
        }
    public void setUmur(int umur) {
        if (umur > 0) {
        this.umur = umur;

    } else {
    System.out.println("Umur tidak valid!");
    }
  }
}
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
    Mahasiswa mhs = new Mahasiswa("Adi", 22);
    
    System.out.println("Nama: " + mhs.getNama());
    System.out.println("Umur: " + mhs.getUmur());
    mhs.setNama("Budi");
    mhs.setUmur(25);
    System.out.println("Nama Baru: " + mhs.getNama());
    System.out.println("Umur Baru: " + mhs.getUmur());
    
    }
}