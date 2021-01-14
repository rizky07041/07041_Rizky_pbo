/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rizky07041_DistroAnime;//e-sistem gangguan jaringan

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Rizky07041_DistroAniime {
static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Distro Anime");
        int Pilihan;
        
        MenuAksesoris aksesoris = new MenuAksesoris();
        MenuPelanggan PelG = new MenuPelanggan();
        
        do{
            System.out.println("1. Aksesoris");
            System.out.println("2. Pelanggan");
            System.out.println("3. Exit");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    aksesoris.TampilanMenu();
                    break;
                case 2:
                    PelG.TampilanMenu();
                    break;
                case 3:
                    System.out.println("Terima Kasih !");
                    break;
                default:
                    System.out.println("Input tidak dikenal");
                    break;
            }
        }while(Pilihan!=3);
    }
}