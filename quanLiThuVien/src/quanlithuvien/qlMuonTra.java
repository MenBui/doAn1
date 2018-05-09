/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import Home.myViewerReport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import static quanlithuvien.ExcelHelperNV.readNV;

/**
 *
 * @author menbt
 */
public class qlMuonTra extends javax.swing.JFrame {

    DefaultTableModel tbn = new DefaultTableModel();

    public void LayDSMuonTra() {
        DefaultTableModel tbn = new DefaultTableModel();
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            int number;
            Vector row, column;
            column = new Vector();
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery("select * from Bangmuontra");
            ResultSetMetaData metaData = rs.getMetaData();
            number = metaData.getColumnCount();

            for (int i = 1; i <= number; i++) {
                column.add(metaData.getColumnName(i));

            }
            tbn.setColumnIdentifiers(column);

            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                tbn.addRow(row);
                table1.setModel(tbn);
            }
            table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    if (table1.getSelectedRow() >= 0) {
                        o_mamuontra.setText(table1.getValueAt(table1.getSelectedRow(), 0) + "");
                        cb_DocGia.setSelectedItem(table1.getValueAt(table1.getSelectedRow(), 1) + "");
                        o_ngaymuon.setText(table1.getValueAt(table1.getSelectedRow(), 2) + "");
                        o_ngayhentra.setText(table1.getValueAt(table1.getSelectedRow(), 3) + "");
                        o_tiencoc.setText(table1.getValueAt(table1.getSelectedRow(), 4) + "");
                        cb_NhanVien.setSelectedItem(table1.getValueAt(table1.getSelectedRow(), 5) + "");
                        LayDSChiTietMuonTra(table1.getValueAt(table1.getSelectedRow(), 0) + "");
                    }
                }
            });

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void LayDSChiTietMuonTra(String MaMuon) {
        DefaultTableModel tbn = new DefaultTableModel();
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            int number;
            Vector row, column;
            column = new Vector();
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery("select * from Bangchitietmuontra WHERE [Mã mượn trả]=" + MaMuon);
            ResultSetMetaData metaData = rs.getMetaData();
            number = metaData.getColumnCount();

            for (int i = 1; i <= number; i++) {
                column.add(metaData.getColumnName(i));

            }
            tbn.setColumnIdentifiers(column);

            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                tbn.addRow(row);
                table2.setModel(tbn);
            }
            table2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    if (table2.getSelectedRow() >= 0) {
                        txt_Masach.setText(table2.getValueAt(table2.getSelectedRow(), 1) + "");
                        Connection con = ConnectionDB.getConnectDB();
                        try {
                            Statement st = con.createStatement();
                            String sql = "SELECT * FROM Bangsach WHERE [Mã sách]='" + txt_Masach.getText() + "'";
                            ResultSet rs = st.executeQuery(sql);
                            if (rs.next()) {
                                txt_NamXB.setText("" + rs.getInt(6));
                                txt_NhaXB.setText(rs.getString(5));
                                txt_TacGia.setText(rs.getString(3));
                                txt_TenSach.setText(rs.getString(2));
                                txt_TheLoai.setText(rs.getString(4));
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(qlMuonTra.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Creates new form qlMuonTra
     */
    public qlMuonTra() {
        initComponents();
        loadData();
        LayDSMuonTra();
        Connection con = ConnectionDB.getConnectDB();
        try {
            Statement st = con.createStatement();
            String sql = "SELECT [Mã NV] FROM Bangnhanvien";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cb_NhanVien.addItem(rs.getString(1));
            }
            sql = "SELECT [Mã độc giả] FROM Bangdocgia";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cb_DocGia.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(qlMuonTra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadData() {

        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            int number;
            Vector row, column;
            column = new Vector();
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery("select * from Bangmuontra");
            ResultSetMetaData metaData = rs.getMetaData();
            number = metaData.getColumnCount();

            for (int i = 1; i <= number; i++) {
                column.add(metaData.getColumnName(i));

            }
            tbn.setColumnIdentifiers(column);

            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));

                }
                tbn.addRow(row);
                table1.setModel(tbn);
            }
            table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    if (table1.getSelectedRow() >= 0) {
                        o_mamuontra.setText(table1.getValueAt(table1.getSelectedRow(), 0) + "");
                        cb_DocGia.setSelectedItem(table1.getValueAt(table1.getSelectedRow(), 1) + "");
                        o_ngaymuon.setText(table1.getValueAt(table1.getSelectedRow(), 2) + "");
                        o_ngayhentra.setText(table1.getValueAt(table1.getSelectedRow(), 3) + "");
                        o_tiencoc.setText(table1.getValueAt(table1.getSelectedRow(), 4) + "");
                        cb_NhanVien.setSelectedItem(table1.getValueAt(table1.getSelectedRow(), 5) + "");
                        o_tennhanvien1.setText(table1.getValueAt(table1.getSelectedRow(), 6) + "");

                    }
                }
            });

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        o_tendocgia = new javax.swing.JTextField();
        o_tennhanvien1 = new javax.swing.JTextField();
        o_ngaymuon = new javax.swing.JTextField();
        o_mamuontra = new javax.swing.JTextField();
        cb_NhanVien = new javax.swing.JComboBox<>();
        cb_DocGia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        o_tiencoc = new javax.swing.JTextField();
        o_ngayhentra = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        o_xoa4 = new javax.swing.JButton();
        o_them2 = new javax.swing.JButton();
        o_sua2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_NgayTra = new javax.swing.JTextField();
        txt_NhaXB = new javax.swing.JTextField();
        txt_TacGia = new javax.swing.JTextField();
        txt_Masach = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cb_ChuaTra = new javax.swing.JCheckBox();
        txt_NamXB = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_TenSach = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cb_MatSach = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        txt_TheLoai = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_TienPhat = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_ghichu = new javax.swing.JTextArea();
        o_them = new javax.swing.JButton();
        o_sua = new javax.swing.JButton();
        o_xoa = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bùi Thị Mến");
        setLocation(new java.awt.Point(100, 70));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Bank_Cards_96px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 11, 112, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("Quản lý mượn trả");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bảng mượn trả", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table1.setRowHeight(25);
        table1.setSelectionBackground(new java.awt.Color(255, 204, 255));
        table1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 530, 230));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin phiếu mượn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 560, 230));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Thông tin mượn trả", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Mã mượn trả:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Ngày mượn:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Tên độc giả:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        o_tendocgia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        o_tendocgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_tendocgiaActionPerformed(evt);
            }
        });
        jPanel2.add(o_tendocgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, 32));

        o_tennhanvien1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(o_tennhanvien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, 32));

        o_ngaymuon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        o_ngaymuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_ngaymuonActionPerformed(evt);
            }
        });
        jPanel2.add(o_ngaymuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, 32));

        o_mamuontra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        o_mamuontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_mamuontraActionPerformed(evt);
            }
        });
        jPanel2.add(o_mamuontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, 33));

        cb_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_NhanVienActionPerformed(evt);
            }
        });
        jPanel2.add(cb_NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 100, 30));

        cb_DocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_DocGiaActionPerformed(evt);
            }
        });
        jPanel2.add(cb_DocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 100, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tên nhân viên:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Ngày hẹn trả:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 30));

        o_tiencoc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        o_tiencoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_tiencocActionPerformed(evt);
            }
        });
        jPanel2.add(o_tiencoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 130, 33));

        o_ngayhentra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        o_ngayhentra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_ngayhentraActionPerformed(evt);
            }
        });
        jPanel2.add(o_ngayhentra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 130, 32));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("IN phiếu MT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 130, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Tiền cọc:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 30));

        o_xoa4.setBackground(new java.awt.Color(153, 255, 255));
        o_xoa4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_xoa4.setText("Xóa");
        o_xoa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_xoa4ActionPerformed(evt);
            }
        });
        jPanel2.add(o_xoa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        o_them2.setBackground(new java.awt.Color(153, 255, 255));
        o_them2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_them2.setText("Thêm");
        o_them2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_them2ActionPerformed(evt);
            }
        });
        jPanel2.add(o_them2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        o_sua2.setBackground(new java.awt.Color(153, 255, 255));
        o_sua2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_sua2.setText("Sửa");
        o_sua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_sua2ActionPerformed(evt);
            }
        });
        jPanel2.add(o_sua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 204, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Thêm file");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 530, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Thông tin sách mượn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Mã sách:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Tác giả:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, -1, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Nhà XB:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Ngày trả:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("VNĐ");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        txt_NgayTra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_NgayTra.setBorder(null);
        jPanel3.add(txt_NgayTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 140, 30));

        txt_NhaXB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_NhaXB.setBorder(null);
        jPanel3.add(txt_NhaXB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 200, 30));

        txt_TacGia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_TacGia.setBorder(null);
        jPanel3.add(txt_TacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 220, 30));

        txt_Masach.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txt_Masach, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 140, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Năm XB:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 30));

        cb_ChuaTra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cb_ChuaTra.setText("Chưa trả");
        cb_ChuaTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ChuaTraActionPerformed(evt);
            }
        });
        jPanel3.add(cb_ChuaTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, 30));

        txt_NamXB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_NamXB.setBorder(null);
        txt_NamXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NamXBActionPerformed(evt);
            }
        });
        jPanel3.add(txt_NamXB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 150, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Tên sách:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        txt_TenSach.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_TenSach.setBorder(null);
        jPanel3.add(txt_TenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 450, 30));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Kiểm tra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 80, 30));

        cb_MatSach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cb_MatSach.setText("Mất sách");
        cb_MatSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_MatSachActionPerformed(evt);
            }
        });
        jPanel3.add(cb_MatSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Thể loại");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        txt_TheLoai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_TheLoai.setBorder(null);
        jPanel3.add(txt_TheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 140, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Tiền phạt:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        txt_TienPhat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_TienPhat.setBorder(null);
        txt_TienPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TienPhatActionPerformed(evt);
            }
        });
        jPanel3.add(txt_TienPhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 100, 30));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ghi chú", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txt_ghichu.setColumns(20);
        txt_ghichu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ghichu.setLineWrap(true);
        txt_ghichu.setRows(5);
        txt_ghichu.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txt_ghichu);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 230, 70));

        o_them.setBackground(new java.awt.Color(153, 255, 255));
        o_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_them.setText("Thêm");
        o_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_themActionPerformed(evt);
            }
        });
        jPanel3.add(o_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        o_sua.setBackground(new java.awt.Color(153, 255, 255));
        o_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_sua.setText("Sửa");
        o_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_suaActionPerformed(evt);
            }
        });
        jPanel3.add(o_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        o_xoa.setBackground(new java.awt.Color(153, 255, 255));
        o_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_xoa.setText("Xóa");
        o_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_xoaActionPerformed(evt);
            }
        });
        jPanel3.add(o_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 204, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Thêm file");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 560, 250));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("SV:Bùi Thị Mến");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 40, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void o_mamuontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_mamuontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_mamuontraActionPerformed

    private void o_ngaymuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_ngaymuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_ngaymuonActionPerformed

    private void o_tendocgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_tendocgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_tendocgiaActionPerformed

    private void cb_DocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_DocGiaActionPerformed
        Connection con = ConnectionDB.getConnectDB();
        try {
            Statement st = con.createStatement();
            String sql = "SELECT [Họ và tên] FROM Bangdocgia WHERE [Mã độc giả]='" + cb_DocGia.getSelectedItem() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                o_tendocgia.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(qlMuonTra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cb_DocGiaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String s = "%" + o_mamuontra.getText() + "%";
        HashMap hash = new HashMap();
        hash.put("ID", s);
        myViewerReport viewer = new myViewerReport("D:\\Java\\quanLiThuVien\\src\\bieuMau\\phieuMT.jasper", hash);
        viewer.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void o_tiencocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_tiencocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_tiencocActionPerformed

    private void o_ngayhentraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_ngayhentraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_ngayhentraActionPerformed

    private void cb_ChuaTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ChuaTraActionPerformed
        if (cb_ChuaTra.isSelected()) {
            txt_TienPhat.setText("0");
        }
    }//GEN-LAST:event_cb_ChuaTraActionPerformed

    private void txt_NamXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NamXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NamXBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con = ConnectionDB.getConnectDB();
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Bangsach WHERE [Mã sách]='" + txt_Masach.getText() + "'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_NamXB.setText("" + rs.getInt(6));
                txt_NhaXB.setText(rs.getString(5));
                txt_TacGia.setText(rs.getString(3));
                txt_TenSach.setText(rs.getString(2));
                txt_TheLoai.setText(rs.getString(4));
            } else {
                JOptionPane.showMessageDialog(null, "Không tồn tại mã sách!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(qlMuonTra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cb_MatSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_MatSachActionPerformed
        if (cb_MatSach.isSelected()) {
            cb_ChuaTra.setSelected(true);
            Connection con = ConnectionDB.getConnectDB();
            try {
                Statement st = con.createStatement();
                String sql = "SELECT * FROM Bangsach WHERE [Mã sách]='" + txt_Masach.getText() + "'";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    txt_TienPhat.setText("" + (rs.getInt(7) * 2));
                }
            } catch (SQLException ex) {
                Logger.getLogger(qlMuonTra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cb_MatSachActionPerformed

    private void txt_TienPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TienPhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TienPhatActionPerformed

    private void cb_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_NhanVienActionPerformed
        Connection con = ConnectionDB.getConnectDB();
        try {
            Statement st = con.createStatement();
            String sql = "SELECT [Tên NV] FROM Bangnhanvien WHERE [Mã NV]='" + cb_NhanVien.getSelectedItem() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                o_tennhanvien1.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(qlMuonTra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cb_NhanVienActionPerformed

    private void o_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_themActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement ps = cnn.prepareStatement("insert into Bangchitietmuontra values(?,?,?,?,?) ");
            ps.setString(1, o_mamuontra.getText());
            ps.setString(2, txt_Masach.getText());
            ps.setString(3, txt_NgayTra.getText());

            ps.setString(4, txt_TienPhat.getText());
            ps.setString(5, txt_ghichu.getText());

            int chk = ps.executeUpdate();
            if (chk > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                tbn.setRowCount(0);
                loadData();
            } else {

            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_o_themActionPerformed

    private void o_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_suaActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement comm = cnn.prepareStatement("Update Bangchitietmuontra set [Mã sách]=?,[Ngày trả]=?,[Tiền phạt]=?,[Ghi chú]=? where [Mã mượn trả]=?");
            comm.setString(5, o_mamuontra.getText());
            comm.setString(1, txt_Masach.getText());
            comm.setString(2, txt_NgayTra.getText());

            comm.setString(3, txt_TienPhat.getText());
            comm.setString(4, txt_ghichu.getText());

            comm.executeUpdate();
            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Có", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                comm.executeUpdate();
                tbn.setRowCount(0);
                loadData();
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_o_suaActionPerformed

    private void o_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_xoaActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement comm = cnn.prepareStatement("DELETE FROM Bangchitietmuontra\n"
                    + " WHERE [Mã mượn trả ] =?\n"
                    + "DELETE FROM Bangmuontra WHERE [Mã mượn trả]=?");
            comm.setString(1, table2.getValueAt(table2.getSelectedRow(), 0).toString());
            comm.setString(2, table2.getValueAt(table2.getSelectedRow(), 0).toString());
            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Xóa",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                comm.executeUpdate();
                tbn.setRowCount(0);
                loadData();
            }
            JOptionPane.showMessageDialog(null, "Đã xóa thành công!");

        } catch (Exception ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Có lỗi chưa xóa được");
        }
    }//GEN-LAST:event_o_xoaActionPerformed

    private void o_xoa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_xoa4ActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement comm = cnn.prepareStatement("DELETE FROM Bangchitietmuontra\n"
                    + " WHERE [Mã mượn trả ] IN\n"
                    + "(SELECT [Mã độc giả ] FROM Bangmuontra \n"
                    + "WHERE [Mã độc giả]= ? )\n"
                    + "DELETE FROM Bangnhanvien\n"
                    + "WHERE [Mã NV]= ?\n"
                    + "DELETE FROM Bangmuontra\n"
                    + "WHERE [Mã mượn trả]= ?");
            comm.setString(1, table1.getValueAt(table1.getSelectedRow(), 0).toString());
            comm.setString(2, table1.getValueAt(table1.getSelectedRow(), 0).toString());
            comm.setString(3, table1.getValueAt(table1.getSelectedRow(), 0).toString());
            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Có",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                comm.executeUpdate();
                tbn.setRowCount(0);
                loadData();
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_o_xoa4ActionPerformed

    private void o_them2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_them2ActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement ps = cnn.prepareStatement("insert into Bangmuontra values(?,?,?,?,?,?,?) ");
            ps.setString(1, o_mamuontra.getText());
            ps.setString(2, cb_DocGia.getSelectedItem().toString());
            ps.setString(3, o_ngaymuon.getText());
            ps.setString(4, o_ngayhentra.getText());
            ps.setString(5, o_tiencoc.getText());
            ps.setString(6, cb_NhanVien.getSelectedItem().toString());
            ps.setString(7, o_tennhanvien1.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            tbn.setRowCount(0);
            loadData();
        } catch (Exception e) {
            System.out.println(e.toString());
        }      // TODO add your handling code here:
    }//GEN-LAST:event_o_them2ActionPerformed

    private void o_sua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_sua2ActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement comm = cnn.prepareStatement("Update Bangmuontra set [Mã độc giả]=?,[Ngày mượn]=?,[Ngày hẹn trả]=?,[Tiền cọc]=?,[Mã NV]=?,[Tên NV]=? where [Mã mượn trả]=?");
            comm.setString(7, o_mamuontra.getText());
            comm.setString(1, cb_DocGia.getSelectedItem().toString());
            comm.setString(2, o_ngaymuon.getText());
            comm.setString(3, o_ngayhentra.getText());
            comm.setString(4, o_tiencoc.getText());
            comm.setString(5, cb_NhanVien.getSelectedItem().toString());
            comm.setString(6, o_tennhanvien1.getText());

            comm.executeUpdate();
            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Có", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                comm.executeUpdate();
                tbn.setRowCount(0);
                loadData();
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }          // TODO add your handling code here:
    }//GEN-LAST:event_o_sua2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser JF = new JFileChooser();
        JF.setDialogTitle("Chọn 1 file execl để nhập dữ liệu.");
        int result = JF.showOpenDialog(null);
        String excelPath = "";
        if (result == JFileChooser.APPROVE_OPTION) {
            excelPath = JF.getSelectedFile().getAbsolutePath();

        }
        try {
            readNV(excelPath);
        } catch (Exception e) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, e);
        }
        loadData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser JF = new JFileChooser();
        JF.setDialogTitle("Chọn 1 file execl để nhập dữ liệu.");
        int result = JF.showOpenDialog(null);
        String excelPath = "";
        if (result == JFileChooser.APPROVE_OPTION) {
            excelPath = JF.getSelectedFile().getAbsolutePath();

        }
        try {
            readNV(excelPath);
        } catch (Exception e) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, e);
        }
        loadData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(qlMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qlMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qlMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qlMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlMuonTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb_ChuaTra;
    private javax.swing.JComboBox<String> cb_DocGia;
    private javax.swing.JCheckBox cb_MatSach;
    private javax.swing.JComboBox<String> cb_NhanVien;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField o_mamuontra;
    private javax.swing.JTextField o_ngayhentra;
    private javax.swing.JTextField o_ngaymuon;
    private javax.swing.JButton o_sua;
    private javax.swing.JButton o_sua2;
    private javax.swing.JTextField o_tendocgia;
    private javax.swing.JTextField o_tennhanvien1;
    private javax.swing.JButton o_them;
    private javax.swing.JButton o_them2;
    private javax.swing.JTextField o_tiencoc;
    private javax.swing.JButton o_xoa;
    private javax.swing.JButton o_xoa4;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTextField txt_Masach;
    private javax.swing.JTextField txt_NamXB;
    private javax.swing.JTextField txt_NgayTra;
    private javax.swing.JTextField txt_NhaXB;
    private javax.swing.JTextField txt_TacGia;
    private javax.swing.JTextField txt_TenSach;
    private javax.swing.JTextField txt_TheLoai;
    private javax.swing.JTextField txt_TienPhat;
    private javax.swing.JTextArea txt_ghichu;
    // End of variables declaration//GEN-END:variables

}
