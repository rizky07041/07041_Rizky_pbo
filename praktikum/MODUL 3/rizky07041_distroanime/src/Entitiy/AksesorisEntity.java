package Entitiy;

public class AksesorisEntity extends IndukEntity{
    
    private int harga;
    private String ukuran, jenis, warna;
    
    public AksesorisEntity(){
        
    }
    
    public int GetIdBarang() {
        return super.Id;
    }

    public void SetIdBarang(int IdBarang) {
        super.Id = IdBarang;
    }

    public int GetHarga() {
        return harga;
    }

    public void SetHarga(int Harga) {
        this.harga = Harga;
    }

    public String GetUkuran() {
        return ukuran;
    }

    public void SetUkuran(String Ukuran) {
        this.ukuran = Ukuran;
    }

    public String GetJenis() {
        return jenis;
    }

    public void SetJenis(String Jenis) {
        this.jenis = Jenis;
    }
    
    public String GetWarna(){
        return warna;
    }
    
    public void SetWarna(String Warna) {
        this.warna = Warna;
    }
}