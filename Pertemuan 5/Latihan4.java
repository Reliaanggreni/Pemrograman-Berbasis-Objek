/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
    class Mesin {
        private void cekBahanBakar() {
        System.out.println("Cek bahan bakar sebelum menyalakan mesin...");
        }
    public void nyalakanMesin() {
        cekBahanBakar();
        System.out.println("Mesin menyala!");
        }
    }
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Mesin mobil = new Mesin();
        mobil.nyalakanMesin();
        
        }
    }
