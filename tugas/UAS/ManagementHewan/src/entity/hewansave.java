/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author L
 */
public class hewansave extends hewanabstrack {
private String save;

public hewansave(String nama,String jenis, String pemakan,String carahidup,String habitat){
 super (nama,jenis,pemakan,carahidup,habitat);
 this.save = save;
}

public hewansave(){
    this.save = save;
}


    @Override
    public String getJenis() {
        return jenis;
    }
    
    public String gethewansave(){
        return save;
    }
    
    public void sethewansave(){
        this.save = save;
    }
    
    
    
}
