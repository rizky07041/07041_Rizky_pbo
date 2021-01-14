package Rizky07041_DistroAnime;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuAksesoris implements DataCRUD {

    protected Scanner input = new Scanner(System.in);
    protected int Index, idbarang, harga, Pilihan;
    protected String ukuran, jenis, warna;
    protected DataInduk data = new DataInduk();

    @Override
    public void Insert() {
        System.out.print("Id Barang      = ");
        idbarang = input.nextInt();
        System.out.print("Harga          = ");
        harga = input.nextInt();
        System.out.print("Ukuran         = ");
        ukuran = input.next();
        System.out.print("Jenis          = ");
        jenis = input.next();
        System.out.print("Warna          = ");
        warna = input.next();
        data.ArrayAksesoris.add(new AksesorisEntity(idbarang, harga, ukuran, jenis, warna));
    }

    @Override
    public void Update() {
        System.out.print("Input Index = ");
        Index = input.nextInt();
        System.out.print("Id Barang         = ");
        idbarang = input.nextInt();
        System.out.print("harga         = ");
        harga = input.nextInt();
        System.out.print("Ukuran        = ");
        ukuran = input.next();
        System.out.print("jenis            = ");
        jenis = input.next();
        System.out.print("Warna            = ");
        warna = input.next();
        data.ArrayAksesoris.set(Index, new AksesorisEntity(idbarang, harga, ukuran, jenis, warna));
    }

    @Override
    public void Delete() {
        System.out.print("Input Index = ");
        Index = input.nextInt();
        data.ArrayAksesoris.remove(Index);
    }

    @Override
    public void TampilanMenu() {
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
                    for (int i = 0; i < data.ArrayAksesoris.size(); i++) {
                        System.out.println("Index " + i);
                        System.out.println("Id Barang    = " + data.ArrayAksesoris.get(i).Getidbarang());
                        System.out.println("Harga        = " + data.ArrayAksesoris.get(i).Getharga());
                        System.out.println("Ukuran       = " + data.ArrayAksesoris.get(i).Getukuran());
                        System.out.println("Jenis        = " + data.ArrayAksesoris.get(i).Getjenis());
                        System.out.println("Warna        = " + data.ArrayAksesoris.get(i).Getwarna());
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
