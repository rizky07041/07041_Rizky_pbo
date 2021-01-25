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
public abstract class hewanabstrack {
    protected String nama,jenis,pemakan,carahidup,habitat;
    
    public hewanabstrack(String nama,String jenis, String pemakan,String carahidup,String habitat){
        this.nama = nama;
        this.jenis = jenis;
        this.pemakan = pemakan;
        this.carahidup = carahidup;
        this.habitat = habitat;
        
    } 
    
    public hewanabstrack(){
        
    }
    
    public abstract String getJenis();
    
    public String getjenis(){
        return jenis;
    }
    
    public void setnama(String nama){
        this.nama =nama;
    }
    
    public String getnama(){
        return nama;
    }
    
    public void setpemakan(String pemakan){
    this.pemakan =pemakan;    
    }
    
    public String getpemakan(){
        return pemakan;
    }
    
    
    
    public void setcarahidup(String carahidup){
     this.carahidup = carahidup;   
    }
    
    public String getcarahidup(){
        return carahidup;
    }
    
    public void sethabitat(String habitat){
        this.habitat = habitat;
    }
    
    public String gethabitat(){
        return habitat;
    }
    
    
    
    
    
    
    
    
    
    
}
