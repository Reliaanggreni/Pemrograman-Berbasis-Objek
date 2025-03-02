/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */

    class Kendaraan {
    // Atribut private untuk menyimpan informasi kendaraan
    String merk;
    String tipe;
    int kecepatan;

    // Konstruktor untuk menginisialisasi objek Kendaraan
    public Kendaraan (String merk, String tipe, int kecepatan) {
    this.merk = merk;
    this.tipe = tipe;
    this.kecepatan = kecepatan;
}
    // Metode untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
       System.out.println("merk: " + merk + ", Tipe: " + tipe + ", kecepatan: " + kecepatan + " km/jam");
    }
    // Metode untuk menambah kecepatan kendaraan
    public void tambahKecepatan(int km) {
        this.kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + "km/jam");
}
    // Metode untuk mengurangi kecepatan kendaraan
    public void kurangiKecepatan(int km) {
        this.kecepatan -= km;
        // Pastikan kecepatan tidak negatif
        if (kecepatan < 0) {
            kecepatan = 0;
        }
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + "km/jam");
}
    // Metode untuk menghentikan kendaraan
    public void berhenti() {
        this.kecepatan = 0;
        System.out.println("kendaraan telah berhenti.");
}
    }
    public class tugas1{
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Kendaraan mobil = new Kendaraan("Toyota", "mobil", 60);
        Kendaraan motor = new Kendaraan("Yamaha", "motor", 40);
        
        // Menampilkan informasi mobil
        mobil.tampilkanInfo();
        mobil.tambahKecepatan(20);
        mobil.kurangiKecepatan(30);
        mobil.berhenti();
        mobil.tampilkanInfo();
        
        System.out.println();
        
       // Menampilkan informasi motor
        motor.tampilkanInfo();
        motor.tambahKecepatan(30);
        motor.kurangiKecepatan(40);
        motor.berhenti();
        motor.tampilkanInfo();
    }
    }
     
