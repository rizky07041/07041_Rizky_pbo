/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import view.allobjctview;

public class tablehewan {
JFrame datahewan = new JFrame();
JTable tabelhewan = new JTable();
JButton back, tampil;
JLabel namalabel,pemakanlabel,data;
JTextField namatext,pemakantext;
 JScrollPane scrolldata = new JScrollPane(tabelhewan);

 public tablehewan (){
    datahewan.setSize(650,500);
    datahewan.setLayout(null);
    data = new JLabel("Data Hewan");
    data.setBounds(250,30,200,30);
    data.setFont(new Font("Times New Roma", Font.BOLD,40));
    datahewan.add(data);
    
    scrolldata.setBounds(30,100,570,200);
    tabelhewan.setModel(allobjctview.hewan.daftarhewan());
    datahewan.add(scrolldata);
    
    
    tampil = new JButton("Print");
    tampil.setBounds(350,350,100,30);
    datahewan.add(tampil);
    
    back = new JButton("Back");
    back.setBounds(350,400,100,30);
    datahewan.add(back);
    
    
    datahewan.setLocationRelativeTo(null);
    datahewan.setVisible(true);
    datahewan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                datahewan.dispose();
                GUI g = new GUI();
            }
        });
    
    tampil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                
                tabelhewan.setModel(allobjctview.hewan.daftarhewan());    
            }
        });    
 }
    
    
    
}
