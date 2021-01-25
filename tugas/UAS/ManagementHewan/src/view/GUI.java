/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;


/**
 *
 * @author L
 */
public class GUI {
    JFrame Login = new JFrame();
    JLabel  top;
    JButton daftar, login,logincheck;
    
    public GUI (){
    Login.setSize(700,630);
    Login.setLayout(null);
    Login.getContentPane().setBackground(Color.ORANGE);
    top = new JLabel ("Manajemen Hewan Punah");
    top.setBounds(105,50,600,50);
    top.setFont(new Font("Times New Roman", Font.BOLD,40));
    Login.add(top);
    
    daftar = new JButton("Daftar");
    daftar.setBounds(120,320,100,40);
    daftar.setBackground(Color.WHITE);
    Login.add(daftar);
    
    login = new JButton("Login");
    login.setBounds(400,320,100,40);
    login.setBackground(Color.WHITE);
    Login.add(login);
    
    logincheck = new JButton("Check");
    logincheck.setBounds(250,400,100,40);
    logincheck.setBackground(Color.white);
    Login.add(logincheck);
    
    
    
    
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login.setVisible(true);
        Login.setLocationRelativeTo(null);
    
    daftar.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.Reghewan reg = new Reghewan();
             Login.dispose();
             JOptionPane.showMessageDialog(null,"INPUT DATA HEWAN", "information", JOptionPane.INFORMATION_MESSAGE);
                    
        }
     });
       
     login.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
           view.Login L = new Login();
             Login.dispose();
             JOptionPane.showMessageDialog(null,"Selamat Datang", "information", JOptionPane.INFORMATION_MESSAGE);
                    
        }
    });
        
       logincheck.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.tablehewan a = new tablehewan();
             Login.dispose();
             JOptionPane.showMessageDialog(null,"Selamat Datang", "information", JOptionPane.INFORMATION_MESSAGE);
                    
        }
    });
        
        
}
}