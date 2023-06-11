/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @AmangArap
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Menggunakan setter untuk mengatur nilai atribut
        person.setName("Rafli");
        person.setAge(21);

        // Menggunakan getter untuk mendapatkan nilai atribut
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

