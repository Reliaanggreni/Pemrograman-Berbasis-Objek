/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author AYU
 */

// Superclass

class Hewan {

void bersuara() {
    System.out.println("Hewan bersuara...");
    }
}

class Kucing extends Hewan {
@Override
void bersuara() {
    System.out.println("Meow! Meow!");
    }
}
class Anjing extends Hewan {
@Override

void bersuara() {
    System.out.println("Guk! Guk!");
    }
}

// Main class
public class Latihan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Hewan hewan1 = new Kucing(); // Polimorfisme
        Hewan hewan2 = new Anjing(); // Polimorfisme
        hewan1.bersuara(); 
        hewan2.bersuara();
    }
}
