/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;

import koneksi.Koneksi;

/**
 *
 * @author AYU
 */
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koneksi db = new Koneksi();

        db.connect(); // akan menampilkan log di console
    }
    
}
