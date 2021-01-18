/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entitiy.PelangganEntity;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PelangganModel {

    private ArrayList<PelangganEntity> ArrayPelanggan;

    public PelangganModel() {
        this.ArrayPelanggan = new ArrayList<>();
    }

    public void Insert(PelangganEntity pelangganEntity) {
        ArrayPelanggan.add(pelangganEntity);
    }

    public void Update(int index, PelangganEntity pelangganEntity) {
        ArrayPelanggan.set(index, pelangganEntity);
    }

    public void Delete(int index) {
        ArrayPelanggan.remove(index);
    }

    public ArrayList<PelangganEntity> getArrayPelanggan() {
        return ArrayPelanggan;
    }

}
