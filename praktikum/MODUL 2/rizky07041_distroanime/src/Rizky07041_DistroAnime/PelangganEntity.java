package Rizky07041_DistroAnime;

public class PelangganEntity extends DataInduk{
    private int Kontak;
    private String NamaPelanggan,Alamat;
    private DataInduk data = new DataInduk();
    
    public PelangganEntity(int IdPelanggan, String NamaPelanggan, int Kontak, String Alamat){
        this.data.id=IdPelanggan;
        this.NamaPelanggan=NamaPelanggan;
        this.Kontak=Kontak;
        this.Alamat=Alamat;
    }
    protected int GetIdPelanggan(){
        return data.id;
    }
    protected String GetNamaPelanggan(){
        return NamaPelanggan;
    }
    protected int GetKontak(){
        return Kontak;
    }
    protected String GetAlamat(){
        return Alamat;
    }
    
    
}
