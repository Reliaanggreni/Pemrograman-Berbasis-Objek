/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */

interface Hewan {
    void makan();
}
interface Mamalia {
    void menyusui();
}
class Kucing implements Hewan, Mamalia {

    public void makan() { System.out.println("Kucing makan ikan."); }
    public void menyusui() { System.out.println("Kucing menyusui anaknya."); }
    }
public class latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Kucing Kucing = new Kucing();
        Kucing.makan();
        Kucing.menyusui();
    }
}
