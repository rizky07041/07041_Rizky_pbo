/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.hewancontroler;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import view.allobjctview;


public class Reghewan {
JFrame input = new JFrame();
JLabel top, labelnama, labelpemakan, labelcarahidup, labelhabitat, labeljenis;
JButton reg,back;
JTextField textnama, textpemakan, textcarahidup,texthabitat,textjenis;


public Reghewan(){
    
  input.setSize(800,630);
  input.setLayout(null);
  input.getContentPane().setBackground(Color.RED);
  top = new JLabel("Daftar");
  top.setBounds(50,10,600,50);
  top.setFont(new Font("Times New Roman", Font.BOLD, 40));
  input.add(top);
  
  labelnama = new JLabel("Nama");
  labelnama.setBounds(400,150,200,30);
  input.add(labelnama);
  
  textnama = new JTextField();
  textnama.setBounds(400,180,200,30);
  input.add(textnama);
  
  labelpemakan = new JLabel("Pemakan");
  labelpemakan.setBounds(400,210,100,30);
  input.add(labelpemakan);
  
  textpemakan = new JTextField();
  textpemakan.setBounds(400,240,200,30);
  input.add(textpemakan);
  
  labelcarahidup = new JLabel("Repoduksi");
  labelcarahidup.setBounds(400,270,100,30);
  input.add(labelcarahidup);
  
  textcarahidup = new JTextField();
  textcarahidup.setBounds(400,300,200,30);
  input.add(textcarahidup);
  
  labelhabitat = new JLabel("Habitat");
  labelhabitat.setBounds(400,330,100,30);
  input.add(labelhabitat);
  
  texthabitat = new JTextField();
  texthabitat.setBounds(400,360,200,30);
  input.add(texthabitat);
  
  labeljenis = new JLabel("Jenis");
  labeljenis.setBounds(400,420,100,30);
  input.add(labeljenis);
  
  textjenis = new JTextField();
  textjenis.setBounds(400,460,200,30);
  input.add(textjenis);
  
  
  reg = new JButton("registrasi");
  reg.setBounds(400,500,200,30);
  input.add(reg);
  
  back = new JButton("back");
  back.setBounds(120,320,100,40);
  input.add(back);
  
  input.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  input.setVisible(true);
  input.setLocationRelativeTo(null);
 
  back.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.GUI g = new GUI();
            input.dispose();
            kosong();
        }
    });
  
  reg.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            String nama = textnama.getText();
            String  jenis = textjenis.getText();
            String pemakan = textpemakan.getText();
            String carahidup = textcarahidup.getText();
            String habitat = texthabitat.getText();
            allobjctview.hewan.instert(nama, jenis, pemakan, carahidup, habitat);
            JOptionPane.showMessageDialog(null,"Registrasi Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
            kosong();
        }
    });
  
  
  
  
}

void kosong(){
textnama.setText(null);
texthabitat.setText(null);
textcarahidup.setText(null);
textpemakan.setText(null);
}    
    
    
}
