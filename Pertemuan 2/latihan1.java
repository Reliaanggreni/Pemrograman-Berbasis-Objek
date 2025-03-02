/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
class Hewan {
    String nama;
    String jenis;
    int umur;

    public Hewan(String nama, String jenis, int umur) {
    this.nama = nama;
    this.jenis = jenis;
    this.umur = umur;
}
    public void tampilkanInfo() {
       System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun");
    }
    public void bertambahUmur(int tahun) {
        this.umur += tahun;
        System.out.println( nama + " telah bertambah umur menjadi" + umur + "tahun.");
}
    public void suaraHewan() {
    if (nama.equalsIgnoreCase("Kucing")) {
        System.out.println(nama + ": Meong!");
    } else if (nama.equalsIgnoreCase("Anjing")) {
        System.out.println(nama + ": Guk guk!");
    } else {
        System.out.println(nama + ": Suara tidak diketahui.");
    }
    }
}
    public class latihan1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // membuat objek hewan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", 3);
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", 2);
        
        hewan1.tampilkanInfo();
        hewan1.suaraHewan();
        hewan1.bertambahUmur(2);
        hewan1.tampilkanInfo();
        
        System.out.println();
        
        hewan2.tampilkanInfo();
        hewan2.suaraHewan();
        hewan2.bertambahUmur(2);
        hewan2.tampilkanInfo();
    }
}
