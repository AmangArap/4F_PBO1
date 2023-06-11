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
public class Character {
    private String name;
    private String role;
    private int bounty;

    // Constructor
    public Character(String name, String role, int bounty) {
        this.name = name;
        this.role = role;
        this.bounty = bounty;
    }

    // Mutator method untuk mengubah nilai atribut name
    public void setName(String name) {
        this.name = name;
    }

    // Mutator method untuk mengubah nilai atribut role
    public void setRole(String role) {
        this.role = role;
    }

    // Mutator method untuk mengubah nilai atribut bounty
    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    // Accessor method untuk mendapatkan nilai atribut name
    public String getName() {
        return name;
    }

    // Accessor method untuk mendapatkan nilai atribut role
    public String getRole() {
        return role;
    }

    // Accessor method untuk mendapatkan nilai atribut bounty
    public int getBounty() {
        return bounty;
    }

    public void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Bounty: " + bounty);
        System.out.println();
    }
}

