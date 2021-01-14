package Rizky07041_DistroAnime;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuAksesoris {
    ArrayList <AksesorisEntity> ArrayAksesoris = new ArrayList();
    Scanner input = new Scanner(System.in);

//(int idbarang, int harga, String ukuran, String jenis, String warna){
    
    public void TampilanMenu(){   
        int Index,idbarang, harga, Pilihan;
        String ukuran, jenis, warna;
        do{
            System.out.println("Menu Distro Aksesoris");
            System.out.println("1. Create Case");
            System.out.println("2. Edit Case");
            System.out.println("3. Delete Case");
            System.out.println("4. Tampilkan Case");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Id Barang          = "); 
                        idbarang = input.nextInt();
                    System.out.print("Harga          = "); 
                        harga = input.nextInt();
                    System.out.print("Ukuran        = "); 
                        ukuran = input.next();
                    System.out.print("Jenis            = "); 
                        jenis = input.next();
                    System.out.print("Warna            = "); 
                        warna = input.next();
                    ArrayAksesoris.add(new AksesorisEntity(idbarang, harga, ukuran, jenis, warna));
                    break;
                case 2:
                    //EDIT
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
                        ArrayAksesoris.set(Index, new AksesorisEntity( idbarang, harga, ukuran, jenis, warna));
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Index = input.nextInt();
                    ArrayAksesoris.remove(Index);
                    break;
                case 4:
                    //VIEW
                    for(int i=0;i<ArrayAksesoris.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Nomor Case          = "+ArrayAksesoris.get(i).Getidbarang());
                        System.out.println("Id Pelanggan        = "+ArrayAksesoris.get(i).Getharga());
                        System.out.println("Id Pelanggan        = "+ArrayAksesoris.get(i).Getukuran());
                        System.out.println("Komplain            = "+ArrayAksesoris.get(i).Getjenis());
                        System.out.println("Id Pelanggan        = "+ArrayAksesoris.get(i).Getwarna());
                        System.out.println("");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");
                    
            }
        }while(Pilihan!=5);
    }
}
