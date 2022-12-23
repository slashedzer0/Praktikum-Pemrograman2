package com.doni.pemrograman2.pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class Registration extends JFrame {
    private JTextField isiNamaLengkap;
    private JTextField isiKataSandi;
    private JRadioButton lakiLakiRadioButton;
    private JTextField isiTempatLahir;
    private JSpinner pilihTanggal;
    private JComboBox pilihBulan;
    private JSpinner pilihTahun;
    private JRadioButton perempuanRadioButton;
    private JComboBox pilihJabatan;
    private JCheckBox indonesiaCheckBox;
    private JCheckBox inggrisCheckBox;
    private JCheckBox mandarinCheckBox;
    private JCheckBox lainnyaCheckBox;
    private JTextField isiBahasa;
    private JTextArea isiAlamat;
    private JSlider aturLevelKeahlian;
    private JButton submitButton;
    private JLabel namaLengkapLabel;
    private JLabel passwordLabel;
    private JLabel jenisKelaminLabel;
    private JLabel TTLLabel;
    private JLabel jabatanLabel;
    private JLabel bahasaLabel;
    private JLabel alamatLabel;
    private JLabel skillLabel;
    private JPanel mainPanel;
    private ButtonGroup jenisKelamin;


    public Registration() {
        super("Formulir Pendaftaran");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800, 600);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // mengambil nilai dari textField
                String namaLengkap = isiNamaLengkap.getText();

                // cara alternatif
                String jKelamin = "";
                Enumeration<AbstractButton> buttons = jenisKelamin.getElements();

                for (int i = 0; i < jenisKelamin.getButtonCount(); i++) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected())
                        jKelamin = button.getText();
                }

                // mengambil nilai dari ComboBox / dropdown
                String jabatan = (String) pilihJabatan.getSelectedItem();

                // mengambil nilai dari Spinner
                int tahun = (int) pilihTahun.getValue();

                // mengatur nilai min an max sebuah slider (default 0 - 100)
                aturLevelKeahlian.setMinimum(50);
                aturLevelKeahlian.setMaximum(200);

                // mengambil nilai dari Slider
                int skill = aturLevelKeahlian.getValue();

                // menampilkan pesan
                JOptionPane.showMessageDialog(null, "Data " + namaLengkap + " tersimpan!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }
}
