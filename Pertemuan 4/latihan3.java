/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
class Hewan{
    void makan(){
     System.out.println("Hewan sedang makan.");
}
}
class Kucing extends Hewan{
    void suara(){
    System.out.println("Kucing Meow!");
}
}
class Anjing extends Hewan{
    void suara(){
    System.out.println("Anjing Guk Guk!");
}
}
public class latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Kucing Kucing = new Kucing();
        Anjing Anjing = new Anjing();
        Kucing.makan();
        Kucing.suara();
        Anjing.makan();
        Anjing.suara();
    }
}
