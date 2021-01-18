package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu {

    JFrame Menu = new JFrame();
    JLabel label1, label2;
    JButton dftrpelanggan, dftraksesoris;

    public Menu() {
        Menu.setSize(400, 275);
        Menu.setLayout(null);
        label1 = new JLabel("Selamat Datang di DistroAnime");
        label1.setBounds(20, 10, 600, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Menu.add(label1);

        label2 = new JLabel("Daftar Menu");
        label2.setBounds(135, 40, 600, 100);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Menu.add(label2);

        dftrpelanggan = new JButton("Daftar Pelanggan");
        dftrpelanggan.setBounds(115, 110, 150, 30);
        Menu.add(dftrpelanggan);

        dftraksesoris = new JButton("DaftarAksesoris");
        dftraksesoris.setBounds(115, 150, 150, 30);
        Menu.add(dftraksesoris);

        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setVisible(true);
        Menu.setLocationRelativeTo(null);

        dftrpelanggan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormDaftarPelanggan plgn = new FormDaftarPelanggan();
                Menu.dispose();
            }
        });
        
        dftraksesoris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormAksesoris acc = new FormAksesoris();
                Menu.dispose();
            }
        });
    }

}
