package com.doni.pemrograman2.pertemuan7;

import javax.swing.*;

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


    public Registration() {
        super("Formulir Pendaftaran");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800, 600);
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }
}
