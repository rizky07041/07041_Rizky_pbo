/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import Model.AksesorisModel;
import Entitiy.AksesorisEntity;

/**
 *
 * @author ASUS
 */
public class AksesorisController {
    private AksesorisModel aksesoris = new AksesorisModel();

    public void InsertAksesoris(int Id, int Harga, String Ukuran, String Jenis, String Warna){
        AksesorisEntity aksesorisEntity = new AksesorisEntity();
        aksesorisEntity.SetIdBarang(Id);
        aksesorisEntity.SetHarga(Harga);
        aksesorisEntity.SetUkuran(Ukuran);
        aksesorisEntity.SetJenis(Jenis);
        aksesorisEntity.SetWarna(Warna);
        aksesoris.Insert(aksesorisEntity);
    }
    
    public void UpdateAksesoris(int index, int Id, int Harga, String Ukuran, String Jenis, String Warna){
        AksesorisEntity aksesorisEntity = new AksesorisEntity();
        aksesorisEntity.SetIdBarang(Id);
        aksesorisEntity.SetHarga(Harga);
        aksesorisEntity.SetUkuran(Ukuran);
        aksesorisEntity.SetJenis(Jenis);
        aksesorisEntity.SetWarna(Warna);
        aksesoris.Update(index, aksesorisEntity);
    }
    
    public void Delete(int index){
        aksesoris.Delete(index);
    }

    public ArrayList<AksesorisEntity> getAksesoris() {
        return aksesoris.getArrayAksesoris();
    }
}
