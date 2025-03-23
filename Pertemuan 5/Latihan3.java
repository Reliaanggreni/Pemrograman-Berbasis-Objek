/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
    class BankAccount {
    private double saldo;
    public BankAccount(double saldoAwal) {
        this.saldo = saldoAwal;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double jumlah) {
        if (jumlah >= 0) {
        this.saldo = jumlah;
        } else {
        System.out.println("Saldo tidak bisa negatif!");
        }
    }
}
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        BankAccount akunSaya = new BankAccount(1000);
        // Menampilkan saldo awal
        System.out.println("Saldo awal: " + akunSaya.getSaldo());
        // Menyetel saldo baru
        akunSaya.setSaldo(2000);
        System.out.println("Saldo setelah diubah: " + akunSaya.getSaldo());
        // Mencoba nominal negatif
        akunSaya.setSaldo(-500);
        System.out.println("Saldo setelah mencoba input negatif: " + akunSaya.getSaldo());
    }
}
