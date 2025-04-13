/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
import java.util.Scanner;
import java.util.Random;

public class TebakAngka {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            
            int angkaRahasia = random.nextInt(100) + 1;
            int tebakan;
            int jumlahPercobaan = 0;
            
            System.out.println("=== Permainan Tebak Angka ===");
            System.out.println("Tebak angka antara 1 sampai 100");
            System.out.println("Ketik 0 untuk keluar.");
            
            while (true) {
                System.out.print("Masukkan tebakan Anda: ");
                tebakan = scanner.nextInt();
                
                if (tebakan == 0) {
                    System.out.println("Anda memilih keluar dari permainan.");
                    break;
                }
                
                jumlahPercobaan++;
                
                if (tebakan < angkaRahasia) {
                    System.out.println("Tebakan terlalu kecil!");
                } else if (tebakan > angkaRahasia) {
                    System.out.println("Tebakan terlalu besar!");
                } else {
                    System.out.println("Selamat! Anda menebak dengan benar.");
                    System.out.println("Jumlah percobaan: " + jumlahPercobaan);
                    break;
                }
            }
            
            System.out.println("Permainan selesai. Terima kasih!");
            scanner.close();
        }
    }

