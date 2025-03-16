/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
class Hewan{
        String nama;
     
        void makan(){
        System.out.println(nama+" sedang makan.");
        }
    }
    
    class Kucing extends Hewan{
        void suara(){
        System.out.println(nama+" mengeong: Meow!");
        }
    }
public class latihan1 {

    public static void main(String args[]) {
       Kucing Kucing1 = new Kucing();
       Kucing1.nama= "Tom";
       Kucing1.makan();
       Kucing1.suara();
    }
}
 
