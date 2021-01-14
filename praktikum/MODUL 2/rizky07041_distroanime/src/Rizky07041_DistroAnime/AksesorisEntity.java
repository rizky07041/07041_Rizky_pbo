package Rizky07041_DistroAnime;

import java.util.ArrayList;

public class AksesorisEntity extends DataInduk{
    
    private int harga;
    private String ukuran, jenis, warna;
    protected DataInduk data = new DataInduk();
    
    public AksesorisEntity(int idbarang, int harga, String ukuran, String jenis, String warna){
        this.data.id=idbarang;
        this.harga=harga;
        this.ukuran=ukuran;
        this.jenis=jenis;
        this.warna=warna;
    }
    
    protected int Getidbarang(){
        return data.id;
    }
    protected int Getharga(){
        return harga;
    }
    protected String Getukuran(){
        return ukuran;
    }
    protected String Getjenis(){
        return jenis;
    }
    protected String Getwarna(){
        return this.warna;
    }
}