/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import entity.hewansave;
public class hewanmodul {
 private ArrayList<hewansave> Hewanarr;
 
 public hewanmodul(){
     Hewanarr = new ArrayList<>();
 }
 
 public void insert (hewansave Hewansave){
     Hewanarr.add(Hewansave);
 }
 
 public ArrayList<hewansave>getHewanarr(){
     return Hewanarr;
 }
 
 
 
}
