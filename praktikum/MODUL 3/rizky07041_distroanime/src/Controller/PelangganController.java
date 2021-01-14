/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import Model.PelangganModel;
import Entitiy.PelangganEntity;

/**
 *
 * @author ASUS
 */
public class PelangganController {
    private PelangganModel pelanggan = new PelangganModel();

    public void InsertPelanggan(int Id, String Nama, int Kontak, String Alamat){
        PelangganEntity pelangganEntity = new PelangganEntity();
        pelangganEntity.SetIdPelanggan(Id);
        pelangganEntity.SetNamaPelanggan(Nama);
        pelangganEntity.SetKontak(Kontak);
        pelangganEntity.SetAlamat(Alamat);
        pelanggan.Insert(pelangganEntity);
    }
    
    public void UpdatePelanggan(int index, int Id, String Nama, int Kontak, String Alamat){
        PelangganEntity pelangganEntity = new PelangganEntity();
        pelangganEntity.SetIdPelanggan(Id);
        pelangganEntity.SetNamaPelanggan(Nama);
        pelangganEntity.SetKontak(Kontak);
        pelangganEntity.SetAlamat(Alamat);
        pelanggan.Update(index, pelangganEntity);
    }
    
    public void Delete(int index){
        pelanggan.Delete(index);
    }

    public ArrayList<PelangganEntity> getPelanggan() {
        return pelanggan.getArrayPelanggan();
    }
}
