/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entitiy.AksesorisEntity;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class AksesorisModel {
    private ArrayList<AksesorisEntity> ArrayAksesoris;
    
    public AksesorisModel(){
        this.ArrayAksesoris = new ArrayList<>();
    }
    
    public void Insert(AksesorisEntity aksesorisEntity){
        ArrayAksesoris.add(aksesorisEntity);
    }
    
    public void Update(int index, AksesorisEntity aksesorisEntity){
        ArrayAksesoris.set(index, aksesorisEntity);
    }
    
    public void Delete(int index){
        ArrayAksesoris.remove(index);
    }
    
    public ArrayList<AksesorisEntity> getArrayAksesoris(){
        return ArrayAksesoris;
    }
}
