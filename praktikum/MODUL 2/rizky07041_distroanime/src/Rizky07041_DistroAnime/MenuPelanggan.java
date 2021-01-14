/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rizky07041_DistroAnime;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuPelanggan implements DataCRUD {

    protected Scanner input = new Scanner(System.in);
    protected int Index, Pilihan, IdPelanggan, Kontak;
    protected String NamaPelanggan, Alamat;
    protected DataInduk data = new DataInduk();

    @Override
    public void Insert() {
        System.out.print("Id Pelanggan   = ");
        IdPelanggan = input.nextInt();
        System.out.print("Nama Pelanggan = ");
        NamaPelanggan = input.next();
        System.out.print("Kontak         = ");
        Kontak = input.nextInt();
        System.out.print("Alamat         = ");
        Alamat = input.next();
        data.ArrayPelanggan.add(new PelangganEntity(IdPelanggan, NamaPelanggan, Kontak, Alamat));
    }

    @Override
    public void Update() {
        System.out.print("Input Index = ");
        Index = input.nextInt();
        System.out.print("Id Pelanggan   = ");
        IdPelanggan = input.nextInt();
        System.out.print("Nama Pelanggan = ");
        NamaPelanggan = input.next();
        System.out.print("Kontak         = ");
        Kontak = input.nextInt();
        System.out.print("Alamat         = ");
        Alamat = input.next();
        data.ArrayPelanggan.set(Index, new PelangganEntity(IdPelanggan, NamaPelanggan, Kontak, Alamat));
    }

    @Override
    public void Delete() {
        System.out.print("Input Index = ");
        Index = input.nextInt();
        data.ArrayPelanggan.remove(Index);
    }

    @Override
    public void TampilanMenu() {
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
                    //CREATE
                    Insert();
                    break;
                case 2:
                    //EDIT
                    Update();
                    break;
                case 3:
                    //DELETE
                    Delete();
                    break;
                case 4:
                    //VIEW
                    for (int i = 0; i < data.ArrayPelanggan.size(); i++) {
                        System.out.println("Index " + i);
                        System.out.println("Id Pelanggan    = " + data.ArrayPelanggan.get(i).GetIdPelanggan());
                        System.out.println("Nama Pelanggan  = " + data.ArrayPelanggan.get(i).GetNamaPelanggan());
                        System.out.println("Kontak          = " + data.ArrayPelanggan.get(i).GetKontak());
                        System.out.println("Alamat          = " + data.ArrayPelanggan.get(i).GetAlamat());
                        System.out.println("");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");

            }
        } while (Pilihan != 5);

    }
}
