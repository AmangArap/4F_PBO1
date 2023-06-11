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
class Sedan extends Mobil {
    private int jumlahPintu;
    
    public Sedan(String merk, String tipe, int tahun, int jumlahPintu) {
        super(merk, tipe, tahun);
        this.jumlahPintu = jumlahPintu;
    }
    
    //Getter dan setter untuk atribut jumlahPintu
    public int getJumlahPintu(){
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    
    //Override merhod info untuk menampilkan informasi sedan beserta jumlah pintunya
    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah Pintu = " + jumlahPintu);
    }
    
    // Overload method start untuk memulai mobil sedan
    public void start(String mode) {
        System.out.println("Mobil sudah dinyalakan dalam mode " + mode);
    }
}
