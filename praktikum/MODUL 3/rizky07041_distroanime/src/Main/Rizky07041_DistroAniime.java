/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.*;
import Entitiy.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Rizky07041_DistroAniime {

    static Scanner input = new Scanner(System.in);
    static AksesorisController aksesoris = new AksesorisController();
    static PelangganController pelanggan = new PelangganController();

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Distro Anime");
        int Pilihan;
        int IdBarang, Harga, IdPelanggan, Kontak, Index;
        String Ukuran, Jenis, Warna, NamaPelanggan, Alamat;

        do {
            System.out.println("1. Aksesoris");
            System.out.println("2. Pelanggan");
            System.out.println("3. Exit");
            System.out.print("Pilihan = ");
            Pilihan = input.nextInt();
            switch (Pilihan) {
                case 1:
                    do {
                        System.out.println("Menu Distro Aksesoris");
                        System.out.println("1. Create Case");
                        System.out.println("2. Edit Case");
                        System.out.println("3. Delete Case");
                        System.out.println("4. Tampilkan Case");
                        System.out.println("5. Kembali");
                        System.out.print("Pilihan = ");
                        Pilihan = input.nextInt();
                        switch (Pilihan) {
                            case 1:
                                try {
                                    System.out.print("Id Barang = ");
                                    IdBarang = input.nextInt();
                                    System.out.print("Harga     = ");
                                    Harga = input.nextInt();
                                    System.out.print("Ukuran    = ");
                                    Ukuran = input.next();
                                    System.out.print("Jenis     = ");
                                    Jenis = input.next();
                                    System.out.print("Warna     = ");
                                    Warna = input.next();
                                    aksesoris.InsertAksesoris(IdBarang, Harga, Ukuran, Jenis, Warna);
                                } catch (InputMismatchException ex) {
                                    System.out.println("Id Barang & Harga harus angka!!!");
                                    input.next();
                                }
                                break;
                            case 2:
                                try {
                                    System.out.print("Index yang diupdate = ");
                                    Index = input.nextInt();
                                    System.out.print("Id Barang           = ");
                                    IdBarang = input.nextInt();
                                    System.out.print("Harga               = ");
                                    Harga = input.nextInt();
                                    System.out.print("Ukuran              = ");
                                    Ukuran = input.next();
                                    System.out.print("Jenis               = ");
                                    Jenis = input.next();
                                    System.out.print("Warna               = ");
                                    Warna = input.next();
                                    aksesoris.UpdateAksesoris(Index, IdBarang, Harga, Ukuran, Jenis, Warna);
                                } catch (InputMismatchException ex) {
                                    System.out.println("Id Barang & Harga harus angka!!!");
                                    input.next();
                                }
                                break;
                            case 3:
                                System.out.print("Index yang dihapus = ");
                                Index = input.nextInt();
                                aksesoris.Delete(Index);
                                break;
                            case 4:
                                for (AksesorisEntity akses : aksesoris.getAksesoris()) {
                                    System.out.println("=====================================");
                                    System.out.println("Id Barang    = " + akses.GetIdBarang());
                                    System.out.println("Harga        = " + akses.GetHarga());
                                    System.out.println("Ukuran       = " + akses.GetUkuran());
                                    System.out.println("Jenis        = " + akses.GetJenis());
                                    System.out.println("Warna        = " + akses.GetWarna());
                                    System.out.println("=====================================\n");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Pilihan tidak dikenali !");
                        }
                    } while (Pilihan != 5);
                    break;
                case 2:
                    do {
                        System.out.println("Menu Pelanggan");
                        System.out.println("1. Tambah Pelanggan");
                        System.out.println("2. Ubah Pelanggan");
                        System.out.println("3. Hapus Pelanggan");
                        System.out.println("4. Tampilkan Pelanggan");
                        System.out.println("5. Kembali");
                        System.out.print("Pilihan = ");
                        Pilihan = input.nextInt();
                        switch (Pilihan) {
                            case 1:
                                try {
                                    System.out.print("Id Pelanggan   = ");
                                    IdPelanggan = input.nextInt();
                                    System.out.print("Nama Pelanggan = ");
                                    NamaPelanggan = input.next();
                                    System.out.print("Kontak         = ");
                                    Kontak = input.nextInt();
                                    System.out.print("Alamat         = ");
                                    Alamat = input.next();
                                    pelanggan.InsertPelanggan(IdPelanggan, NamaPelanggan, Kontak, Alamat);
                                } catch (InputMismatchException ex) {
                                    System.out.println("Id Pelanggan & Kontak harus angka!!!");
                                    input.next();
                                }
                                break;
                            case 2:
                                try {
                                    System.out.print("Index yang diupdate = ");
                                    Index = input.nextInt();
                                    System.out.print("Id Pelanggan        = ");
                                    IdPelanggan = input.nextInt();
                                    System.out.print("Nama Pelanggan      = ");
                                    NamaPelanggan = input.next();
                                    System.out.print("Kontak              = ");
                                    Kontak = input.nextInt();
                                    System.out.print("Alamat              = ");
                                    Alamat = input.next();
                                    pelanggan.UpdatePelanggan(Index, IdPelanggan, NamaPelanggan, Kontak, Alamat);
                                } catch (InputMismatchException ex) {
                                    System.out.println("Id Pelanggan & Kontak harus angka!!!");
                                    input.next();
                                }
                                break;
                            case 3:
                                System.out.print("Index yang dihapus = ");
                                Index = input.nextInt();
                                pelanggan.Delete(Index);
                                break;
                            case 4:
                                for (PelangganEntity plnggn : pelanggan.getPelanggan()) {
                                    System.out.println("===========================================");
                                    System.out.println("Id Pelanggan   = " + plnggn.GetIdPelanggan());
                                    System.out.println("Nama Pelanggan = " + plnggn.GetNamaPelanggan());
                                    System.out.println("Kontak         = " + plnggn.GetKontak());
                                    System.out.println("Alamat         = " + plnggn.GetAlamat());
                                    System.out.println("===========================================\n");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Pilihan tidak dikenali !");

                        }
                    } while (Pilihan != 5);
                    break;
                case 3:
                    System.out.println("Terima Kasih !");
                    break;
                default:
                    System.out.println("Input tidak dikenal");
                    break;
            }
        } while (Pilihan != 3);
    }
}
