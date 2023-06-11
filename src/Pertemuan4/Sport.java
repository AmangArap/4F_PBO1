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
class Sport extends Mobil {
    private int kecepatanMax;
    
    public Sport(String merk, String tipe, int tahun, int kecepatanMax) {
        super(merk, tipe, tahun);
        this.kecepatanMax = kecepatanMax;
    }
    
    //Getter dan setter untuk atribut jumlahPintu
    public int getKecepatanMax(){
        return kecepatanMax;
    }
    
    public void setKecepatanMax(int kecepatanMax) {
        this.kecepatanMax = kecepatanMax;
    }
    
    //Override merhod info untuk menampilkan informasi sedan beserta jumlah pintunya
    @Override
    public void info() {
        super.info();
        System.out.println("Kecepatan Maksimum = " + kecepatanMax);
    }
    
    // Overload method start untuk memulai mobil sedan
    public void start(int rpm) {
        System.out.println("Mobil sport dinyalakan dengan rpm " + rpm);
    }
}
