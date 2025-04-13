/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            char ulang;
            
            do {
                System.out.print("Masukkan angka pertama: ");
                double angka1 = scanner.nextDouble();
                
                System.out.print("Masukkan operator (+, -, *, /, %): ");
                char operator = scanner.next().charAt(0);
                
                System.out.print("Masukkan angka kedua: ");
                double angka2 = scanner.nextDouble();
                
                double hasil;
                
                switch (operator) {
                    case '+' -> {
                        hasil = angka1 + angka2;
                        System.out.println("Hasil: " + hasil);
                    }
                    case '-' -> {
                        hasil = angka1 - angka2;
                        System.out.println("Hasil: " + hasil);
                    }
                    case '*' -> {
                        hasil = angka1 * angka2;
                        System.out.println("Hasil: " + hasil);
                    }
                    case '/' -> {
                        if (angka2 != 0) {
                            hasil = angka1 / angka2;
                            System.out.println("Hasil: " + hasil);
                        } else {
                            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        }
                    }
                    case '%' -> {
                        if (angka2 != 0) {
                            hasil = angka1 % angka2;
                            System.out.println("Hasil: " + hasil);
                        } else {
                            System.out.println("Error: Modulo dengan nol tidak diperbolehkan.");
                        }
                    }
                    default -> System.out.println("Error: Operator tidak valid.");
                }
                
                System.out.print("Ingin menghitung lagi? (y/n): ");
                ulang = scanner.next().charAt(0);
                
            } while (ulang == 'y' || ulang == 'Y');
            
            System.out.println("Terima kasih telah menggunakan kalkulator.");
        }
    }
}
