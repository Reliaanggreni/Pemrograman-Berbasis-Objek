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
        public Mahasiswa(String nama) {
        this.nama = nama;
        }
// Getter untuk mengakses nama
    public String getNama() {
        return nama;
        }
    }
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa("Adi");
        System.out.println(mhs.getNama()); 
    }
}
