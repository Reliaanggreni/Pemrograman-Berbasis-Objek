/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            ArrayList<String> daftarTugas = new ArrayList<>();
            
            boolean berjalan = true;
            
            while (berjalan) {
                System.out.println("\n=== MENU TO-DO LIST ===");
                System.out.println("1. Tambah Tugas");
                System.out.println("2. Lihat Semua Tugas");
                System.out.println("3. Hapus Tugas");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");
                
                int pilihan = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan tugas baru: ");
                        String tugasBaru = scanner.nextLine();
                        daftarTugas.add(tugasBaru);
                        System.out.println("Tugas berhasil ditambahkan.");
                    }
                        
                    case 2 -> {
                        System.out.println("\n--- Daftar Tugas ---");
                        if (daftarTugas.isEmpty()) {
                            System.out.println("Belum ada tugas.");
                        } else {
                            for (int i = 0; i < daftarTugas.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarTugas.get(i));
                            }
                        }
                    }
                        
                    case 3 -> {
                        System.out.println("\n--- Hapus Tugas ---");
                        if (daftarTugas.isEmpty()) {
                            System.out.println("Tidak ada tugas yang bisa dihapus.");
                        } else {
                            for (int i = 0; i < daftarTugas.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarTugas.get(i));
                            }
                            System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                            int indeks = scanner.nextInt();
                            scanner.nextLine();
                            
                            if (indeks >= 1 && indeks <= daftarTugas.size()) {
                                String tugasDihapus = daftarTugas.remove(indeks - 1);
                                System.out.println("Tugas \"" + tugasDihapus + "\" berhasil dihapus.");
                            } else {
                                System.out.println("Nomor tugas tidak valid.");
                            }
                        }
                    }
                        
                    case 4 -> {
                        berjalan = false;
                        System.out.println("Keluar dari program. Sampai jumpa!");
                    }
                        
                    default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
                    scanner.close();
        }
    }
