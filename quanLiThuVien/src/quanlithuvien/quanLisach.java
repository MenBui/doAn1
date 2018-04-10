/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class quanLisach extends javax.swing.JFrame {

    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

    DefaultTableModel tbn = new DefaultTableModel();

    public quanLisach() {
        initComponents();
        loadData();
    }

    public void loadData() {

        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            int number;
            Vector row, column;
            column = new Vector();
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery("select * from Bangsach");
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
                Table_S.setModel(tbn);
            }
            Table_S.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    if (Table_S.getSelectedRow() >= 0) {
                        o_masach.setText(Table_S.getValueAt(Table_S.getSelectedRow(), 0) + "");
                        o_tensach.setText(Table_S.getValueAt(Table_S.getSelectedRow(), 1) + "");
                        o_tacgia.setText(Table_S.getValueAt(Table_S.getSelectedRow(), 2) + "");
                        o_theloai.setText(Table_S.getValueAt(Table_S.getSelectedRow(), 3) + "");
                        o_nhaxuatban.setText(Table_S.getValueAt(Table_S.getSelectedRow(), 4) + "");
                        o_namxuatban.setText(Table_S.getValueAt(Table_S.getSelectedRow(), 5) + "");
                        o_dongia.setText(Table_S.getValueAt(Table_S.getSelectedRow(), 6) + "");
                        o_soluong.setText(Table_S.getValueAt(Table_S.getSelectedRow(), 7) + "");

                    }
                }
            });

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_S = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        o_masach = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        o_tensach = new javax.swing.JTextField();
        o_theloai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        o_soluong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        o_dongia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        o_namxuatban = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        o_nhaxuatban = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        o_them = new javax.swing.JButton();
        o_sua = new javax.swing.JButton();
        o_xoa = new javax.swing.JButton();
        o_tacgia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý độc giả-Bùi Thị Mến");
        setLocation(new java.awt.Point(200, 100));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Table_S.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Table_S.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Table_S.setForeground(new java.awt.Color(255, 0, 153));
        Table_S.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table_S.setSelectionBackground(new java.awt.Color(255, 0, 153));
        Table_S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_SMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_S);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mã sách:");

        o_masach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_masachActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tên sách:");

        o_tensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_tensachActionPerformed(evt);
            }
        });

        o_theloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_theloaiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Tác giả:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Thể loại:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Số lượng:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Đơn giá:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Năm xuất bản:");

        o_nhaxuatban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_nhaxuatbanActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Nhà xuất bản:");

        o_them.setBackground(new java.awt.Color(153, 255, 255));
        o_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_them.setText("Thêm");
        o_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_themActionPerformed(evt);
            }
        });

        o_sua.setBackground(new java.awt.Color(153, 255, 255));
        o_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_sua.setText("Sửa");
        o_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_suaActionPerformed(evt);
            }
        });

        o_xoa.setBackground(new java.awt.Color(153, 255, 255));
        o_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_xoa.setText("Xóa");
        o_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_xoaActionPerformed(evt);
            }
        });

        o_tacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_tacgiaActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\menbt\\Desktop\\sachcp.jpg")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 102));
        jLabel10.setText("Quản Lý Sách");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thoát");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(233, 233, 233)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(o_namxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(o_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(o_nhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(o_them, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap())
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(o_dongia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(o_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(o_tacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(o_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(o_masach, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(o_theloai, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(534, 534, 534)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(o_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(o_masach, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(o_nhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 99, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(o_them, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(o_namxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(o_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(o_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(o_dongia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(o_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(o_tacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(7, 7, 7)))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(o_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(o_theloai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void o_masachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_masachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_masachActionPerformed

    private void o_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_themActionPerformed
        if (checksymbol.checksymbol(o_dongia.getText()) == false || (checksymbol.checksymbol(o_soluong.getText()) == false)) {
            JOptionPane.showMessageDialog(null, "Ô đơn giá và số lượng phải là kiểu số nguyên");
        } else {

            try {
                ConnectionDB a = new ConnectionDB();
                Connection cnn = a.getConnectDB();
                PreparedStatement ps = cnn.prepareStatement("insert into Bangsach values(?,?,?,?,?,?,?,?) ");
                ps.setString(1, o_masach.getText());
                ps.setString(2, o_tensach.getText());
                ps.setString(3, o_tacgia.getText());
                ps.setString(4, o_theloai.getText());
                ps.setString(5, o_nhaxuatban.getText());
                ps.setString(6, o_namxuatban.getText());
                ps.setString(7, o_dongia.getText());
                ps.setString(8, o_soluong.getText());
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
        }
    }//GEN-LAST:event_o_themActionPerformed

    private void Table_SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_SMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_SMouseClicked

    private void o_theloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_theloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_theloaiActionPerformed

    private void o_tacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_tacgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_tacgiaActionPerformed

    private void o_nhaxuatbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_nhaxuatbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_nhaxuatbanActionPerformed

    private void o_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_xoaActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement comm = cnn.prepareStatement("DELETE FROM Bangchitietmuontra\n"
                    + " WHERE [Mã sách ] IN\n"
                    + "(SELECT [Mã sách ] FROM Bangsach \n"
                    + "WHERE [Mã sách]= ? )"
                    + "DELETE FROM Bangsach\n"
                    + "WHERE [Mã sách]= ?\n");

            comm.setString(1, Table_S.getValueAt(Table_S.getSelectedRow(), 0).toString());
            comm.setString(2, Table_S.getValueAt(Table_S.getSelectedRow(), 0).toString());

            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Có",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                comm.executeUpdate();
                tbn.setRowCount(0);
                loadData();
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_o_xoaActionPerformed

    private void o_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_suaActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement comm = cnn.prepareStatement("Update Bangsach set [Tên sách] =?,[Tác giả]=?,[Thể loại]=?,[Nhà xuất bản]=?,[Năm xuất bản]=?,[Đơn giá]=?,[Số lượng]=? where [Mã sách]=? ");
            comm.setString(8, o_masach.getText());
            comm.setString(1, o_tensach.getText());
            comm.setString(2, o_tacgia.getText());
            comm.setString(3, o_theloai.getText());
            comm.setString(4, o_nhaxuatban.getText());
            comm.setString(5, o_namxuatban.getText());
            comm.setString(6, o_dongia.getText());
            comm.setString(7, o_soluong.getText());
            comm.executeUpdate();
            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Có", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                comm.executeUpdate();
                tbn.setRowCount(0);
                loadData();
                JOptionPane.showMessageDialog(null, "Sửa thành công!");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_o_suaActionPerformed

    private void o_tensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_tensachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_tensachActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int p = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            setVisible(false);
            quanLi ql = new quanLi();
            ql.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(quanLisach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanLisach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanLisach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanLisach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quanLisach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_S;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField o_dongia;
    private javax.swing.JTextField o_masach;
    private javax.swing.JTextField o_namxuatban;
    private javax.swing.JTextField o_nhaxuatban;
    private javax.swing.JTextField o_soluong;
    private javax.swing.JButton o_sua;
    private javax.swing.JTextField o_tacgia;
    private javax.swing.JTextField o_tensach;
    private javax.swing.JTextField o_theloai;
    private javax.swing.JButton o_them;
    private javax.swing.JButton o_xoa;
    // End of variables declaration//GEN-END:variables
}
