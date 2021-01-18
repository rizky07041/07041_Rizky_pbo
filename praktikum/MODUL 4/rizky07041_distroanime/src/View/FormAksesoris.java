package View;

import Controller.AksesorisController;
import Controller.PelangganController;
import Entitiy.AksesorisEntity;
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

public class FormAksesoris {

    JFrame form = new JFrame();
    JTable tabel = new JTable();
    JTextArea area = new JTextArea();
    JScrollPane scroll = new JScrollPane(tabel);
    JLabel label1;
    JTextField textid, textharga, textjenis, textukuran, textwarna;
    JLabel labelid, labelharga, labeljenis, labelukuran, labelwarna;
    JButton tambah, update, delete, back;
    private static AksesorisController acc = new AksesorisController();
    String Text1 = "============================\n";
    String Text2 = "Id       = ";
    String Text3 = "Harga    = ";
    String Text4 = "Jenis    = ";
    String Text5 = "Ukuran   = ";
    String Text6 = "Warna    = ";
    String Text7 = "============================\n";

    public FormAksesoris() {
        form.setSize(725, 500);
        form.setLayout(null);
        label1 = new JLabel("Data Aksesoris");
        label1.setBounds(225, 10, 600, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        form.add(label1);

        area.setBounds(330, 85, 350, 290);
        form.add(area);

        labelid = new JLabel("ID");
        labelid.setBounds(30, 85, 80, 30);
        form.add(labelid);

        labelharga = new JLabel("Harga");
        labelharga.setBounds(30, 150, 80, 30);
        form.add(labelharga);

        textid = new JTextField();
        textid.setBounds(100, 85, 200, 30);
        form.add(textid);

        textharga = new JTextField();
        textharga.setBounds(100, 150, 200, 30);
        form.add(textharga);

        labeljenis = new JLabel("Jenis");
        labeljenis.setBounds(30, 215, 80, 30);
        form.add(labeljenis);

        textjenis = new JTextField();
        textjenis.setBounds(100, 215, 200, 30);
        form.add(textjenis);

        labelukuran = new JLabel("Ukuran");
        labelukuran.setBounds(30, 280, 80, 30);
        form.add(labelukuran);

        textukuran = new JTextField();
        textukuran.setBounds(100, 280, 200, 30);
        form.add(textukuran);

        labelwarna = new JLabel("Warna");
        labelwarna.setBounds(30, 345, 80, 30);
        form.add(labelwarna);

        textwarna = new JTextField();
        textwarna.setBounds(100, 345, 200, 30);
        form.add(textwarna);

        tambah = new JButton("Tambah");
        tambah.setBounds(30, 410, 90, 30);
        form.add(tambah);

        update = new JButton("Update");
        update.setBounds(150, 410, 90, 30);
        form.add(update);

        delete = new JButton("Delete");
        delete.setBounds(270, 410, 90, 30);
        form.add(delete);

        back = new JButton("Kembali");
        back.setBounds(590, 410, 90, 30);
        form.add(back);

        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
        form.setLocationRelativeTo(null);

        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(textid.getText());
                    int harga = Integer.parseInt(textharga.getText());
                    String jenis = textjenis.getText();
                    String ukuran = textukuran.getText();
                    String warna = textwarna.getText();

                    acc.InsertAksesoris(id, harga, ukuran, jenis, warna);
                    JOptionPane.showMessageDialog(null, "Berhasil ditambahkan", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    if (area != null) {
                        area.setText("");
                        for (AksesorisEntity akses : acc.getAksesoris()) {
                            area.append(Text1);
                            area.append(Text2);
                            area.append(Integer.toString(akses.GetIdBarang()) + "\n");
                            area.append(Text3);
                            area.append(Integer.toString(akses.GetHarga()) + "\n");
                            area.append(Text4);
                            area.append(akses.GetJenis() + "\n");
                            area.append(Text5);
                            area.append(akses.GetUkuran() + "\n");
                            area.append(Text6);
                            area.append(akses.GetWarna() + "\n");
                            area.append(Text7);
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
                    int harga = Integer.parseInt(textharga.getText());
                    String jenis = textjenis.getText();
                    String ukuran = textukuran.getText();
                    String warna = textwarna.getText();
                    int index = Integer.parseInt(JOptionPane.showInputDialog(null, "INDEX")); 
                    acc.UpdateAksesoris(index, id, harga, ukuran, jenis, warna);
                    JOptionPane.showMessageDialog(null, "Berhasil ditambahkan", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    if (area != null) {
                        area.setText("");
                        for (AksesorisEntity akses : acc.getAksesoris()) {
                            area.append(Text1);
                            area.append(Text2);
                            area.append(Integer.toString(akses.GetIdBarang()) + "\n");
                            area.append(Text3);
                            area.append(Integer.toString(akses.GetHarga()) + "\n");
                            area.append(Text4);
                            area.append(akses.GetJenis() + "\n");
                            area.append(Text5);
                            area.append(akses.GetUkuran() + "\n");
                            area.append(Text6);
                            area.append(akses.GetWarna() + "\n");
                            area.append(Text7);
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
                acc.Delete(index);
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
        textharga.setText(null);
        textjenis.setText(null);
        textukuran.setText(null);
        textwarna.setText(null);
    }

}
