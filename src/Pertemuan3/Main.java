/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @AmangArap
 */
public class Main {
    public static void main(String[] args) {
        Character luffy = new Character("Monkey D. Luffy", "Captain", 1_500_000_000);
        luffy.introduce();

        Character zoro = new Character("Roronoa Zoro", "Swordsman", 320_000_000);
        zoro.introduce();

        // Mengubah nilai atribut menggunakan metode mutator
        zoro.setName("Zoro");
        zoro.setBounty(400_000_000);
        zoro.introduce();
    }
}

