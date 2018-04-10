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
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class QLDG extends javax.swing.JFrame {

    DefaultTableModel tbn = new DefaultTableModel();

    public QLDG() {
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
            ResultSet rs = st.executeQuery("select * from Bangdocgia");
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
                Table_DG.setModel(tbn);
            }
            Table_DG.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    if (Table_DG.getSelectedRow() >= 0) {
                        o_madocgia.setText(Table_DG.getValueAt(Table_DG.getSelectedRow(), 0) + "");
                        o_hovaten.setText(Table_DG.getValueAt(Table_DG.getSelectedRow(), 1) + "");
                        o_ngaysinh.setText(Table_DG.getValueAt(Table_DG.getSelectedRow(), 2) + "");
                        o_gioitinh.setText(Table_DG.getValueAt(Table_DG.getSelectedRow(), 3) + "");
                        o_soCMND.setText(Table_DG.getValueAt(Table_DG.getSelectedRow(), 4) + "");
                        o_sodienthoai.setText(Table_DG.getValueAt(Table_DG.getSelectedRow(), 5) + "");
                        o_email.setText(Table_DG.getValueAt(Table_DG.getSelectedRow(), 6) + "");
                        o_quequan.setText(Table_DG.getValueAt(Table_DG.getSelectedRow(), 7) + "");

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
        Table_DG = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        o_madocgia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        o_hovaten = new javax.swing.JTextField();
        o_gioitinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        o_quequan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        o_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        o_sodienthoai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        o_soCMND = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        o_them = new javax.swing.JButton();
        o_sua = new javax.swing.JButton();
        o_xoa = new javax.swing.JButton();
        o_ngaysinh = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý độc giả-Bùi Thị Mến");

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Table_DG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Table_DG.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Table_DG.setForeground(new java.awt.Color(255, 0, 153));
        Table_DG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table_DG.setSelectionBackground(new java.awt.Color(255, 0, 153));
        Table_DG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_DGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_DG);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mã độc giả:");

        o_madocgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_madocgiaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Họ và tên:");

        o_hovaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_hovatenActionPerformed(evt);
            }
        });

        o_gioitinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_gioitinhActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Ngày sinh:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Giới tính:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Quê quán:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Số điện thoại:");

        o_soCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_soCMNDActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Số CMND:");

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

        o_ngaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_ngaysinhActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\menbt\\Desktop\\docGia.png")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 102));
        jLabel10.setText("Quản lý độc giả");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thoát");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
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
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
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
                                                .addComponent(o_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(o_soCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(o_them, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap())
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(o_email, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(o_sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(o_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(o_hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(o_madocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(o_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(534, 534, 534)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(o_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(o_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(o_madocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(o_soCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(o_them, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(o_sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(o_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(o_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(o_hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(o_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(o_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(o_quequan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(o_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
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

    private void o_madocgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_madocgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_madocgiaActionPerformed

    private void o_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_themActionPerformed
       
        
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement ps = cnn.prepareStatement("insert into Bangdocgia values(?,?,?,?,?,?,?,?) ");
            ps.setString(1, o_madocgia.getText());
            ps.setString(2, o_hovaten.getText());
            ps.setString(3, o_ngaysinh.getText());
            ps.setString(4, o_gioitinh.getText());
            ps.setString(5, o_soCMND.getText());
            ps.setString(6, o_sodienthoai.getText());
            ps.setString(7, o_email.getText());
            ps.setString(8, o_quequan.getText());
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

    private void Table_DGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_DGMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_DGMouseClicked

    private void o_gioitinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_gioitinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_gioitinhActionPerformed

    private void o_ngaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_ngaysinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_ngaysinhActionPerformed

    private void o_soCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_soCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_soCMNDActionPerformed

    private void o_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_xoaActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement comm = cnn.prepareStatement("DELETE FROM Bangchitietmuontra\n"
                    + " WHERE [Mã mượn trả ] IN\n"
                    + "(SELECT [Mã mượn trả ] FROM Bangmuontra \n"
                    + "WHERE [Mã độc giả]= ? )\n"
                    + "DELETE FROM Bangmuontra\n"
                    + "WHERE [Mã độc giả]= ?\n"
                    + "DELETE FROM Bangdocgia\n"
                    + "WHERE [Mã độc giả]= ?");
            comm.setString(1, Table_DG.getValueAt(Table_DG.getSelectedRow(), 0).toString());
            comm.setString(2, Table_DG.getValueAt(Table_DG.getSelectedRow(), 0).toString());
            comm.setString(3, Table_DG.getValueAt(Table_DG.getSelectedRow(), 0).toString());
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
            PreparedStatement comm = cnn.prepareStatement("Update Bangdocgia set [Họ và tên] =?,[Ngày sinh]=?,[Giới tính]=?,[Số CMND]=?,[Số điện thoại]=?,[Email]=?,[Quê quán]=? where [Mã độc giả]=? ");
            comm.setString(8, o_madocgia.getText());
            comm.setString(1, o_hovaten.getText());
            comm.setString(2, o_ngaysinh.getText());
            comm.setString(3, o_gioitinh.getText());
            comm.setString(4, o_soCMND.getText());
            comm.setString(5, o_sodienthoai.getText());
            comm.setString(6, o_email.getText());
            comm.setString(7, o_quequan.getText());
            
            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Có", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                comm.executeUpdate();
                tbn.setRowCount(0);
                loadData();
                JOptionPane.showMessageDialog(null, "Sửa thành công!");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Có lỗi");
        }

    }//GEN-LAST:event_o_suaActionPerformed

    private void o_hovatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_hovatenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_hovatenActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int p = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            setVisible(false);
            quanLi ql = new quanLi();
            ql.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked
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
            java.util.logging.Logger.getLogger(QLDG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_DG;
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
    private javax.swing.JTextField o_email;
    private javax.swing.JTextField o_gioitinh;
    private javax.swing.JTextField o_hovaten;
    private javax.swing.JTextField o_madocgia;
    private javax.swing.JTextField o_ngaysinh;
    private javax.swing.JTextField o_quequan;
    private javax.swing.JTextField o_soCMND;
    private javax.swing.JTextField o_sodienthoai;
    private javax.swing.JButton o_sua;
    private javax.swing.JButton o_them;
    private javax.swing.JButton o_xoa;
    // End of variables declaration//GEN-END:variables
}
