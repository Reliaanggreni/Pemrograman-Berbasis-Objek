/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
import java.util.Scanner;

public class ValidasiLogin {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String usernameBenar = "relia";
            String passwordBenar = "relia12";
            
            int percobaan = 0;
            boolean berhasilLogin = false;
            
            while (percobaan < 3) {
                
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();
                
                if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                    System.out.println("Selamat datang, " + username + "!");
                    berhasilLogin = true;
                    break;
                } else {
                    percobaan++;
                    System.out.println("Username atau password salah. Percobaan:" + percobaan + "/3");

                }
            }
            
            if (!berhasilLogin) {
                System.out.println("Akun diblokir!");
            }
        }

    }
}
