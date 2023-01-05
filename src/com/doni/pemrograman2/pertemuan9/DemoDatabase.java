package com.doni.pemrograman2.pertemuan9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DemoDatabase extends JFrame {
    private JTabbedPane tabbedPane;
    private JPanel mainPanel;
    private JPanel addDataTab;
    private JPanel seeDataTab;
    private JTextField namaLengkapTextField;
    private JTextField nimTextField;
    private JSpinner nilaiSpinner;
    private JButton submitButton;
    private JTable dataTable;
    private JButton editButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JLabel namaLengkapLabel;
    private JLabel NIMLabel;
    private JLabel nilaiLabel;

    private DefaultTableModel model;

    private static Connection c;
    private static Statement s;
    private static ResultSet rs;

    public DemoDatabase() {
        super("Demo Database");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        nilaiSpinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));

        // Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = namaLengkapTextField.getText();
                String nim = nimTextField.getText();
                int nilai = (int) nilaiSpinner.getValue();

                try {
                    openDb();
                    s.executeUpdate("INSERT INTO mahasiswa VALUES ('" + nama + "', '" + nim + "', " + nilai + ")");

                    Object[] row = {nama, nim, nilai};
                    model.addRow(row);

                    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
                }

                catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                finally {
                    closeDb();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new DemoDatabase();
        mainFrame.setVisible(true);
    }

    /**
     * Method untuk membuka akses ke Database
     */
    private static void openDb() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/db_demo";
        String USERNAME = "root";
        String PASSWORD = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        s = c.createStatement();
    }

    /**
     * Method untuk menutup akses ke Database
     */
    private static void closeDb() {
        try {
            rs.close();
            c.close();
            s.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method untuk pembuatan tabel
     */
    private void createUIComponents() {
        // Mengatur model table
        model = new DefaultTableModel();
        dataTable = new JTable(model);

        // Mengatur kolom table
        model.addColumn("Nama");
        model.addColumn("NIM");
        model.addColumn("Nilai");

        // Mengambil nilai
        try {
            openDb();
            rs = s.executeQuery("SELECT * FROM mahasiswa");

            while (rs.next()) {
                Object[] row = {
                        rs.getString("nama"),
                        rs.getString("nim"),
                        rs.getInt("nilai")
                };
                model.addRow(row);
            }
        }

        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        finally {
            closeDb();
        }
    }
}