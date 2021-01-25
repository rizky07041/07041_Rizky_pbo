/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.hewanabstrack;
import entity.hewansave;
import model.hewanmodul;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.allobjctview;
import static view.allobjctview.modul;
public class hewancontroler {
private hewanmodul hewan = new hewanmodul();

public hewancontroler(){
    
}

public void instert(String nama,String jenis, String pemakan,String carahidup,String habitat){
 hewansave save = new hewansave();
 save.setnama(nama);
 save.setpemakan(pemakan);
 save.setcarahidup(carahidup);
 save.sethabitat(habitat);
 hewan.insert(save);
}

public ArrayList<hewansave> getsave(){
    return hewan.getHewanarr();
}

public DefaultTableModel daftarhewan(){
        DefaultTableModel dtmdaftarhewan = new DefaultTableModel();
        Object[] kolom = {"nama", "pemakan", "Repoduksi","habitat"};
        dtmdaftarhewan.setColumnIdentifiers(kolom);
       for (hewansave arrhewan : view.allobjctview.hewan.getsave()){
           Object[] data = new Object[5];
            data[0] = arrhewan.getnama();
            data[1] = arrhewan.getpemakan();
            data[2] = arrhewan.getcarahidup();
            data[3] = arrhewan.gethabitat();
            
            
            dtmdaftarhewan.addRow(data);
       }
        return dtmdaftarhewan;
        }
        
    }



