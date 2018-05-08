/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import java.sql.*;
import java.awt.List;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class timKiem extends javax.swing.JFrame {

    private static String source = null;
    private static String Drm = null;
    private static String Sqlx = null;
    private static Connection cnn = null;
    private static ResultSet Rlst = null;
    private static PreparedStatement pstt = null;

    public static Connection cons() {
        try {
            String uRL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QLTV";
            String user = "sa";
            String pass = "12011998";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection(uRL, user, pass);
            System.out.println("Kết nối thành công");
        } catch (Exception e) {
            System.out.println("Kết nối không thành công");
        }

        return cnn;

    }

    public timKiem() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        o_nhap3 = new javax.swing.JTextField();
        o_timKiemSach = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        DG3 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        o_nhap4 = new javax.swing.JTextField();
        o_timKiemNhanvien = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        DG4 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        o_nhap1 = new javax.swing.JTextField();
        o_timKiemMuontra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DG1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        o_nhap = new javax.swing.JTextField();
        o_timKiemDocgia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DG = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_SoKQ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bùi Thị Mến");
        setLocation(new java.awt.Point(100, 50));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Tìm kiếm");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 44, -1, -1));

        jTabbedPane2.setBackground(new java.awt.Color(255, 204, 255));

        jPanel8.setBackground(new java.awt.Color(255, 204, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Nội dung tìm kiếm sách:");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 25, -1, -1));

        o_nhap3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_nhap3ActionPerformed(evt);
            }
        });
        jPanel8.add(o_nhap3, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 22, 331, 33));

        o_timKiemSach.setBackground(new java.awt.Color(255, 0, 0));
        o_timKiemSach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        o_timKiemSach.setForeground(new java.awt.Color(255, 255, 255));
        o_timKiemSach.setText("Tìm kiếm");
        o_timKiemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_timKiemSachActionPerformed(evt);
            }
        });
        jPanel8.add(o_timKiemSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 20, -1, 33));

        DG3.setBackground(new java.awt.Color(255, 204, 255));
        DG3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DG3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DG3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DG3.setRowHeight(25);
        jScrollPane4.setViewportView(DG3);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1049, 268));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("THÔNG TIN TÌM KIẾM SÁCH");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 80, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1067, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Sách", jPanel3);

        jPanel9.setBackground(new java.awt.Color(255, 204, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Nội dung tìm kiếm nhân viên:");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 25, -1, -1));

        o_nhap4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_nhap4ActionPerformed(evt);
            }
        });
        jPanel9.add(o_nhap4, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 22, 331, 33));

        o_timKiemNhanvien.setBackground(new java.awt.Color(255, 0, 0));
        o_timKiemNhanvien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        o_timKiemNhanvien.setForeground(new java.awt.Color(255, 255, 255));
        o_timKiemNhanvien.setText("Tìm kiếm");
        o_timKiemNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_timKiemNhanvienActionPerformed(evt);
            }
        });
        jPanel9.add(o_timKiemNhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 20, -1, 33));

        DG4.setBackground(new java.awt.Color(255, 204, 255));
        DG4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DG4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DG4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DG4.setRowHeight(25);
        jScrollPane5.setViewportView(DG4);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1049, 268));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("THÔNG TIN TÌM KIẾM NHÂN VIÊN");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 70, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1067, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Nhân viên", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nội dung tìm kiếm mượn trả:");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 25, -1, -1));

        o_nhap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_nhap1ActionPerformed(evt);
            }
        });
        jPanel6.add(o_nhap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 22, 331, 33));

        o_timKiemMuontra.setBackground(new java.awt.Color(255, 0, 0));
        o_timKiemMuontra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        o_timKiemMuontra.setForeground(new java.awt.Color(255, 255, 255));
        o_timKiemMuontra.setText("Tìm kiếm");
        o_timKiemMuontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_timKiemMuontraActionPerformed(evt);
            }
        });
        jPanel6.add(o_timKiemMuontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 20, -1, 33));

        DG1.setBackground(new java.awt.Color(255, 204, 255));
        DG1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DG1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DG1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DG1.setRowHeight(25);
        jScrollPane2.setViewportView(DG1);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1049, 268));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("THÔNG TIN TÌM KIẾM MƯỢN TRẢ");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 70, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1067, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Mượn trả", jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nội dung tìm kiếm độc giả:");

        o_nhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_nhapActionPerformed(evt);
            }
        });

        o_timKiemDocgia.setBackground(new java.awt.Color(255, 0, 0));
        o_timKiemDocgia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        o_timKiemDocgia.setForeground(new java.awt.Color(255, 255, 255));
        o_timKiemDocgia.setText("Tìm kiếm");
        o_timKiemDocgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_timKiemDocgiaActionPerformed(evt);
            }
        });

        DG.setBackground(new java.awt.Color(255, 204, 255));
        DG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DG.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DG.setRowHeight(25);
        jScrollPane1.setViewportView(DG);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("THÔNG TIN TÌM KIẾM ĐỘC GIẢ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(o_nhap, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(o_timKiemDocgia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(o_nhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o_timKiemDocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Độc Giả", jPanel2);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, -1, 404));

        txt_SoKQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_SoKQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txt_SoKQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 528, 1092, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Search_96px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 11, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void o_timKiemDocgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_timKiemDocgiaActionPerformed

        Connection cnn = cons();
        int dem = 0;

        String ID = "N'%" + o_nhap.getText().trim() + "%'";
        Sqlx = "select * from Bangdocgia where [Mã độc giả] LIKE " + ID + " or [Họ và tên] like " + ID + " or [Ngày sinh] like " + ID + " or [Giới tính] like " + ID + " or [Số CMND] like " + ID + " or [Số điện thoại] like " + ID + " or [Email] like " + ID + " or [Quê quán] like " + ID;

        String Columns[] = {"Mã độc giả", "Họ và tên", "Ngày sinh", "Giới tính", "Số CMND", "Số điện thoại", "Email", "Quê quán"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(Columns);
        Object[] row;
        try {
            Statement st = cnn.createStatement();
            Rlst = st.executeQuery(Sqlx);
            while (Rlst.next()) {
                row = new Object[8];
                row[0] = Rlst.getString("Mã độc giả");
                row[1] = Rlst.getString("Họ và tên");
                row[2] = Rlst.getString("Ngày sinh");
                row[3] = Rlst.getInt("Giới tính") == 1 ? "Nam" : "Nữ";
                row[4] = Rlst.getString("Số CMND");
                row[5] = Rlst.getString("Số điện thoại");
                row[6] = Rlst.getString("Email");
                row[7] = Rlst.getString("Quê quán");
                model.addRow(row);
                dem++;
            }
            DG.setModel(model);
            txt_SoKQ.setText("Tìm thấy " + dem + " kết quả.");
        } catch (SQLException ex) {
            Logger.getLogger(timKiem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_o_timKiemDocgiaActionPerformed

    private void o_nhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_nhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_nhapActionPerformed

    private void o_timKiemMuontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_timKiemMuontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_timKiemMuontraActionPerformed

    private void o_nhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_nhap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_nhap1ActionPerformed

    private void o_timKiemNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_timKiemNhanvienActionPerformed
        Connection cnn = cons();
        int dem = 0;

        String ID = "N'%" + o_nhap4.getText().trim() + "%'";
        Sqlx = "select * from Bangnhanvien where [Mã NV] LIKE " + ID + " or [Tên NV] like " + ID + " or [Ngày sinh] like " + ID + " or [Giới tính] like " + ID + " or [Số CMND] like " + ID + " or [Số điện thoại] like " + ID + " or [Email] like " + ID + " or [Quê quán] like " + ID;

        String Columns[] = {"Mã độc giả", "Họ và tên", "Ngày sinh", "Giới tính", "Số CMND", "Số điện thoại", "Email", "Quê quán"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(Columns);
        Object[] row;
        try {
            Statement st = cnn.createStatement();
            Rlst = st.executeQuery(Sqlx);

            while (Rlst.next()) {
                row = new Object[8];

                row[0] = Rlst.getString("Mã NV");
                row[1] = Rlst.getString("Tên NV");
                row[2] = Rlst.getString("Ngày sinh");
                row[3] = Rlst.getInt("Giới tính") == 1 ? "Nam" : "Nữ";
                row[4] = Rlst.getString("Số CMND");
                row[5] = Rlst.getString("Số điện thoại");
                row[6] = Rlst.getString("Email");
                row[7] = Rlst.getString("Quê quán");
                model.addRow(row);
                dem++;

            }
            DG4.setModel(model);
            txt_SoKQ.setText("Tìm thấy " + dem + " kết quả.");

        } catch (SQLException ex) {
            Logger.getLogger(timKiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_o_timKiemNhanvienActionPerformed

    private void o_nhap4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_nhap4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_nhap4ActionPerformed

    private void o_timKiemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_timKiemSachActionPerformed
        Connection cnn = cons();
        int dem = 0;

        String ID = "N'%" + o_nhap3.getText().trim() + "%'";
        Sqlx = "select * from Bangsach where [Mã sách] LIKE " + ID + " or [Tên sách] like " + ID + " or [Tác giả] like " + ID + " or [Thể loại] like " + ID + " or [Nhà xuất bản] like " + ID + " or [Năm xuất bản] like " + ID + " or [Đơn giá] like " + ID + " or [Số lượng] like " + ID;

        String Columns[] = {"Mã sách", "Tên sách", "Tác giả", "Thể loại", "Nhà xuất bản", "Năm xuất bản", "Đơn giá", "Số lượng"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(Columns);
        Object[] row;
        try {
            Statement st = cnn.createStatement();
            Rlst = st.executeQuery(Sqlx);
            while (Rlst.next()) {
                row = new Object[8];
                row[0] = Rlst.getString("Mã sách");
                row[1] = Rlst.getString("Tên sách");
                row[2] = Rlst.getString("Tác giả");
                row[3] = Rlst.getString("Thể loại");
                row[4] = Rlst.getString("Nhà xuất bản");
                row[5] = Rlst.getString("Năm xuất bản");
                row[6] = Rlst.getString("Đơn giá");
                row[7] = Rlst.getString("Số lượng");
                model.addRow(row);
                dem++;

            }
            DG3.setModel(model);
            txt_SoKQ.setText("Tìm thấy " + dem + " kết quả.");

        } catch (SQLException ex) {
            Logger.getLogger(timKiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_o_timKiemSachActionPerformed

    private void o_nhap3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_nhap3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_nhap3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            setVisible(false);
            quanLi ql = new quanLi();
            ql.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    }
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
            java.util.logging.Logger.getLogger(timKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new timKiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DG;
    private javax.swing.JTable DG1;
    private javax.swing.JTable DG3;
    private javax.swing.JTable DG4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField o_nhap;
    private javax.swing.JTextField o_nhap1;
    private javax.swing.JTextField o_nhap3;
    private javax.swing.JTextField o_nhap4;
    private javax.swing.JButton o_timKiemDocgia;
    private javax.swing.JButton o_timKiemMuontra;
    private javax.swing.JButton o_timKiemNhanvien;
    private javax.swing.JButton o_timKiemSach;
    private javax.swing.JLabel txt_SoKQ;
    // End of variables declaration//GEN-END:variables
}
