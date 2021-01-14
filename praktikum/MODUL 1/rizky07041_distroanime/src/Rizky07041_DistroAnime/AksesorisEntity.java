package Rizky07041_DistroAnime;

public class AksesorisEntity {
    
    int idbarang, harga;
    String ukuran, jenis, warna;
    
    public AksesorisEntity(int idbarang, int harga, String ukuran, String jenis, String warna){
        this.idbarang=idbarang;
        this.harga=harga;
        this.ukuran=ukuran;
        this.jenis=jenis;
        this.warna=warna;
   
    }

    int Getidbarang(){
        return this.idbarang;
    }
    int Getharga(){
        return this.harga;
    }
    String Getukuran(){
        return this.ukuran;
    }
    String Getjenis(){
        return this.jenis;
    }
    String Getwarna(){
        return this.warna;
    }
}