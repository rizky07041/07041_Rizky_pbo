package Entitiy;

public class PelangganEntity extends IndukEntity {

    private int Kontak;
    private String NamaPelanggan, Alamat;

    public PelangganEntity() {

    }

    public int GetIdPelanggan() {
        return super.Id;
    }

    public void SetIdPelanggan(int IdPelanggan) {
        super.Id = IdPelanggan;
    }

    public String GetNamaPelanggan() {
        return NamaPelanggan;
    }

    public void SetNamaPelanggan(String NamaPelanggan) {
        this.NamaPelanggan = NamaPelanggan;
    }

    public int GetKontak() {
        return Kontak;
    }

    public void SetKontak(int Kontak) {
        this.Kontak = Kontak;
    }

    public String GetAlamat() {
        return Alamat;
    }

    public void SetAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

}
