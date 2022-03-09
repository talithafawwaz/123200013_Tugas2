/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;
import java.util.Scanner;//untuk menghubungkan dengan scanner input
import tugas2.ruang.Balok;//untuk menghubungkan dengan class balok
import tugas2.ruang.Tabung;//untuk menghubungkan dengan class tabung
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        boolean pilihan = false;
        int ulang;
        System.out.println("Nama    : Talitha Fawwaz");
        System.out.println("NIM     : 123200013");
        System.out.println("Kelas   : IF - F\n");
        do{
            int pilih;
            double panjang, lebar, tinggiBalok, jari, tinggiTabung;
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========\n");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();

            if(pilih == 1){
                System.out.print("Input Panjang   : "); 
                panjang = input.nextInt();
                System.out.print("Input Lebar     : "); 
                lebar = input.nextInt();
                System.out.print("Input Tinggi    : "); 
                tinggiBalok = input.nextInt();

                Balok balok = new Balok(tinggiBalok,panjang,lebar);//instansiasi objek
                
                System.out.println("\n==================");
                System.out.println("Hasil Perhitungan");
                System.out.println("==================\n");
                System.out.println("Luas Persegi Panjang        : " + balok.luas());
                System.out.println("Keliling Persegi Panjang    : " + balok.keliling());
                System.out.println("Volume Balok                : " + balok.volume());
                System.out.println("Luas Permukaan Balok        : " + balok.luasPermukaan()); 
            }
            else if (pilih == 2){
                System.out.print("Input Jari-jari Tabung : "); 
                jari = input.nextInt();
                System.out.print("Input Tinggi Tabung    : "); 
                tinggiTabung = input.nextInt();

                Tabung tabung = new Tabung(tinggiTabung,jari);//instansiasi objek

                System.out.println("\n==================");
                System.out.println("Hasil Perhitungan");
                System.out.println("==================\n");
                System.out.println("Luas Lingkaran         : " + tabung.luas());
                System.out.println("Keliling Lingkaran     : " + tabung.keliling());
                System.out.println("Volume Tabung          : " + tabung.volume());
                System.out.println("Luas Permukaan Tabung  : " + tabung.luasPermukaan());
            }
            else if (pilih == 0){
                System.exit(0);
            }
            else{
                System.out.println("Silahkan Input dengan Benar!");
                pilihan = true;
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0) = ");
            ulang = input.nextInt();
            if(ulang == 1){
                pilihan =  true;
                System.out.println("\n");
            }
            else if (ulang == 0){
                System.exit(0);
            }
       }while(pilihan = true);
    }
}
