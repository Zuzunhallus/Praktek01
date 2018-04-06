/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author USER
 */
public class AirmineralAksi {
    public static void main(String[] args) {
        
        Airmineral Una = new Airmineral();
        
        Una.warna="Warna Putih";
        Una.merk="Merk Prof";
        Una.tanggalexp="TanggalExp 26062018";
        Una.ukuranair="UkuranAir 600ml";
        Una.ukuranbotol="UkuranBotol Sedang";
        
        Una.cetakInfo();
        
        Airmineral Nurul = new Airmineral();
        
        Nurul.warna="Warna Putih";
        Nurul.merk="Merk Le Minerale";
        Nurul.tanggalexp="TanggalExp 27072018";
        Nurul.ukuranair="UkuranAir 330ml";
        Nurul.ukuranbotol="UkuranBotol Kecil";
        
        Nurul.cetakInfo();
        
        Airmineral Zuzun = new Airmineral();
        
        Zuzun.warna="Warna Putih";
        Zuzun.merk="Merk Aqua";
        Zuzun.tanggalexp="TanggalExp 28082018";
        Zuzun.ukuranair="UkuranAir 1500ml";
        Zuzun.ukuranbotol="UkuranBotol Besar";
        
        Zuzun.cetakInfo();
    }
}
