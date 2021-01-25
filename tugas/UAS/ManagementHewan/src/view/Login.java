package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import view.GUI;
import entity.hewansave;
import model.hewanmodul;
import view.allobjctview;
import static view.allobjctview.hewan;

public class Login {
JFrame Login = new JFrame();
JButton login,back,update,hapus;
JTextField textnama,textjenis;
JTextArea area = new JTextArea();;
JLabel labellogin,labelnama,labeljenis;

public Login(){
        
Login.setSize(720,600);
Login.setLayout(null);
Login.getContentPane().setBackground(Color.YELLOW);
labellogin = new JLabel("Print Data Hewan");
labellogin.setFont(new Font("Times New Roman", Font.BOLD,28));
labellogin.setBounds(90,30,200,30);
Login.add(labellogin);

area.setBounds(30,90,400,300);
Login.add(area);

  labelnama = new JLabel("NAMA");
  labelnama.setBounds(440,150,100,30);
  Login.add(labelnama);
  
  textnama = new JTextField();
  textnama.setBounds(440,180,200,30);
  Login.add(textnama);
  
  labeljenis = new JLabel("JENIS");
  labeljenis.setBounds(440,210,100,30);
  Login.add(labeljenis);
  
  textjenis = new JTextField();
  textjenis.setBounds(440,240,200,30);
  Login.add(textjenis);

  
  login = new JButton("Login");
  login.setBackground(Color.WHITE);
  login.setBounds(440,280,100,30);
  Login.add(login);
  
  update = new JButton("Update");
  update.setBounds(440,340,100,30);
  update.setBackground(Color.WHITE);
  Login.add(update);
  
  back = new JButton("Back");
  back.setBounds(440,390,100,30);
  Login.add(back);
  
  hapus = new JButton("Hapus");
  hapus.setBounds(440,440,100,30);
  hapus.setBackground(Color.WHITE);
  Login.add(hapus);
  
  

Login.setVisible(true);
Login.setLocationRelativeTo(null);
Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

login.addActionListener(new ActionListener(){
    String accountsave;
            @Override
            public void actionPerformed(ActionEvent ae){
            for (hewansave arrhewan : hewan.getsave()){
	    String text ="Nama :"+ arrhewan.getnama()+"\n Pemakan"+arrhewan.getpemakan()+"\n Repoduksi :"+arrhewan.getcarahidup()+"\n Habitat :"+arrhewan.gethabitat();
	    area.setText("HASIL DATA SAAT INI MENUJUKAN BAHWA HEWAN :\n"+text);
            hewan.getsave();
            JOptionPane.showMessageDialog(null,"Selamat Datang", "information", JOptionPane.INFORMATION_MESSAGE);
            kosong();
                 } 
            }
    

});

update.addActionListener(new ActionListener(){
   
            @Override
            public void actionPerformed(ActionEvent ae){
            view.update g = new update();
             allobjctview.hewan.getsave().remove(0);
            JOptionPane.showMessageDialog(null,"update data hewan", "information", JOptionPane.INFORMATION_MESSAGE);
            Login.dispose();
            }
    

});
        
hapus.addActionListener(new ActionListener(){
   
            @Override
            public void actionPerformed(ActionEvent ae){
            allobjctview.hewan.getsave().remove(0);
            JOptionPane.showMessageDialog(null,"Maaf DATA ANDA INPUT Terhapus", "information", JOptionPane.INFORMATION_MESSAGE);
            view.GUI g = new GUI();
            Login.dispose();
            
            }
    

});

 back.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.GUI g = new GUI();
            Login.dispose();
            
        }
    });

        
}
void kosong(){
        textnama.setText(null);
        textjenis.setText(null);
        
        
    }
}    