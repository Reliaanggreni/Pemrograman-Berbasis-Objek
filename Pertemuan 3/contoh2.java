/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */
//Interface
    interface Hewan{
    void bersuara(); //method abstrak
}

//Implementasi pada kelas Kucing
    class Kucing implements Hewan{
       @Override
       public void bersuara(){
           System.out.println("Kucing Mengeong: Meow Meow!");
       }
    }
    
//Implementasi pada kelas Anjing
    class Anjing implements Hewan{
        @Override
        public void bersuara(){
            System.out.println("Anjing Menggonggong: Woof Woof!");
        }
    }
//Main class
public class contoh2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.bersuara();
        anjing.bersuara();
    }
}
