/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
// Abstract class Kendaraan
abstract class Kendaraan {
    String nama;
    int jumlahRoda;

    // Constructor
    public Kendaraan(String nama, int jumlahRoda) {
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }

    // Method abstrak yang harus diimplementasikan oleh subclass
    abstract void bergerak();

    // Method untuk menampilkan informasi kendaraan
    public void info() {
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }
}

// Subclass Mobil
class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama, 4);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Subclass SepedaMotor
class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama) {
        super(nama, 2);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Interface KendaraanListrik
interface KendaraanListrik {
    void isiDaya();
}

// Subclass MobilListrik yang merupakan subclass dari Mobil dan mengimplementasikan KendaraanListrik
class MobilListrik extends Mobil implements KendaraanListrik {
    public MobilListrik(String nama) {
        super(nama);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan motor listrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

// class untuk menjalankan program
public class latihan1 {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan sepedaMotor = new SepedaMotor("Honda");
        MobilListrik tesla = new MobilListrik("Tesla Model 3");

        // Output untuk Mobil dan SepedaMotor
        mobil.info();
        mobil.bergerak();
        
        sepedaMotor.info();
        sepedaMotor.bergerak();

        // Output untuk MobilListrik
        tesla.info();
        tesla.bergerak();
        tesla.isiDaya();
    }
}
