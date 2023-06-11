/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil1 dengan tipe Mobil
        Mobil mobil1 = new Mobil("Toyota", "Corolla", 2020 );
        mobil1.info();
        mobil1.start();
        System.out.println();

        // Membuat objek sedan1 dengan tipe Sedan
        Sedan sedan1 = new Sedan("Honda", "Civic Type-R", 2019, 4);
        sedan1.info();
        sedan1.start("Eco");
        System.out.println();

        // Membuat objek sport1 dengan tipe Sport
        Sport sport1 = new Sport("Nissan", "GT-R", 2021, 320 );
        sport1.info();
        sport1.start(5000);
        System.out.println();
        
    }
}