/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author AmangArap
 */
class Mobil {
    private String merk;
    private String tipe;
    private int tahun;
    
    public Mobil(String merk, String tipe, int tahun) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
    }
    
    // Getter dan setter untuk atribut merk
     public String getMerk(){
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    } 
    // Getter dan setter untuk atribut tipe
     public String getTipe(){
        return tipe;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    // Getter dan setter untuk atribut tahun
    public int getTahun(){
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    //method info
    public void info() {
        System.out.println("Merk : " + merk);
        System.out.println("Tipe : " + tipe);
        System.out.println("Tahun : " + tahun);
    }
    
    //Method Start
    public void start() {
        System.out.println("Mobil dinyalakan");
    }
}
