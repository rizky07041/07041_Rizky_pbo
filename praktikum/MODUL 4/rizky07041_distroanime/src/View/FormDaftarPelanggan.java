package View;

import Controller.PelangganController;
import Entitiy.PelangganEntity;
import Model.PelangganModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormDaftarPelanggan {

    JFrame form = new JFrame();
    JTable tabel = new JTable();
    JTextArea area = new JTextArea();
    JScrollPane scroll = new JScrollPane(tabel);
    JLabel label1;
    JTextField textid, textnama, textkontak, textalamat;
    JLabel labelid, labelnama, labelkontak, labelalamat;
    JButton tambah, update, delete, back;
    private static PelangganController plgn = new PelangganController();
    String Text1 = "============================\n";
    String Text2 = "Id      = ";
    String Text3 = "Nama    = ";
    String Text4 = "Kontak  = ";
    String Text5 = "Alamat  = ";
    String Text6 = "============================\n";

    public FormDaftarPelanggan() {
        form.setSize(725, 450);
        form.setLayout(null);
        label1 = new JLabel("Daftar Pelanggan");
        label1.setBounds(225, 10, 600, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        form.add(label1);

        area.setBounds(330, 85, 350, 225);
        //tabel.setModel(plgn.TabelPelanggan());
        form.add(area);

        labelid = new JLabel("ID");
        labelid.setBounds(30, 85, 80, 30);
        form.add(labelid);

        labelnama = new JLabel("Nama");
        labelnama.setBounds(30, 150, 80, 30);
        form.add(labelnama);

        textid = new JTextField();
        textid.setBounds(100, 85, 200, 30);
        form.add(textid);

        textnama = new JTextField();
        textnama.setBounds(100, 150, 200, 30);
        form.add(textnama);

        labelkontak = new JLabel("Kontak");
        labelkontak.setBounds(30, 215, 80, 30);
        form.add(labelkontak);

        textkontak = new JTextField();
        textkontak.setBounds(100, 215, 200, 30);
        form.add(textkontak);

        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(30, 280, 80, 30);
        form.add(labelalamat);

        textalamat = new JTextField();
        textalamat.setBounds(100, 280, 200, 30);
        form.add(textalamat);

        tambah = new JButton("Tambah");
        tambah.setBounds(30, 345, 90, 30);
        form.add(tambah);

        update = new JButton("Update");
        update.setBounds(150, 345, 90, 30);
        form.add(update);

        delete = new JButton("Delete");
        delete.setBounds(270, 345, 90, 30);
        form.add(delete);
        
        back = new JButton("Kembali");
        back.setBounds(590, 345, 90, 30);
        form.add(back);

        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
        form.setLocationRelativeTo(null);

        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(textid.getText());
                    String nama = textnama.getText();
                    int kontak = Integer.parseInt(textkontak.getText());
                    String alamat = textalamat.getText();

                    plgn.InsertPelanggan(id, nama, kontak, alamat);
                    JOptionPane.showMessageDialog(null, "Berhasil ditambahkan", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    if (area != null) {
                        area.setText("");
                        for (PelangganEntity plnggn : plgn.getPelanggan()) {
                            area.append(Text1);
                            area.append(Text2);
                            area.append(Integer.toString(plnggn.GetIdPelanggan()) + "\n");
                            area.append(Text3);
                            area.append(plnggn.GetNamaPelanggan() + "\n");
                            area.append(Text4);
                            area.append(Integer.toString(plnggn.GetKontak()) + "\n");
                            area.append(Text5);
                            area.append(plnggn.GetAlamat() + "\n");
                            area.append(Text6);
                        }
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "infomation", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(textid.getText());
                    String nama = textnama.getText();
                    int kontak = Integer.parseInt(textkontak.getText());
                    String alamat = textalamat.getText();
                    int index = Integer.parseInt(JOptionPane.showInputDialog(null, "INDEX"));
                    plgn.UpdatePelanggan(index, id, nama, kontak, alamat);
                    JOptionPane.showMessageDialog(null, "Berhasil diupdate", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    if (area != null) {
                        area.setText("");
                        for (PelangganEntity plnggn : plgn.getPelanggan()) {
                            area.append(Text1);
                            area.append(Text2);
                            area.append(Integer.toString(plnggn.GetIdPelanggan()) + "\n");
                            area.append(Text3);
                            area.append(plnggn.GetNamaPelanggan() + "\n");
                            area.append(Text4);
                            area.append(Integer.toString(plnggn.GetKontak()) + "\n");
                            area.append(Text5);
                            area.append(plnggn.GetAlamat() + "\n");
                            area.append(Text6);
                        }
                    }
                } catch (Exception ecepption) {
                    JOptionPane.showMessageDialog(null, "Input Terlebih Dahulu", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Integer.parseInt(JOptionPane.showInputDialog(null, "INDEX"));
                plgn.Delete(index);
                JOptionPane.showMessageDialog(null, "Berhasil Terhapus", "information", JOptionPane.INFORMATION_MESSAGE);
                if (area != null) {
                    area.setText("");
                }
            }
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.dispose();
                Menu gui = new Menu();
            }
        });
    }

    void kosong() {
        textid.setText(null);
        textnama.setText(null);
        textkontak.setText(null);
        textalamat.setText(null);
    }

}
