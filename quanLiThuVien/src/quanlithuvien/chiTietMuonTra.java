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

public class chiTietMuonTra extends javax.swing.JFrame {

    DefaultTableModel tbn = new DefaultTableModel();

    public chiTietMuonTra() {
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
            ResultSet rs = st.executeQuery("select * from Bangchitietmuontra");
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
                Table_CTMT.setModel(tbn);
            }
            Table_CTMT.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    if (Table_CTMT.getSelectedRow() >= 0) {
                        o_mamuontra.setText(Table_CTMT.getValueAt(Table_CTMT.getSelectedRow(), 0) + "");
                        o_masach.setText(Table_CTMT.getValueAt(Table_CTMT.getSelectedRow(), 1) + "");
                        o_ngaytra.setText(Table_CTMT.getValueAt(Table_CTMT.getSelectedRow(), 2) + "");

                        o_tienphat.setText(Table_CTMT.getValueAt(Table_CTMT.getSelectedRow(), 3) + "");
                        o_ghichu.setText(Table_CTMT.getValueAt(Table_CTMT.getSelectedRow(), 4) + "");

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
        Table_CTMT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        o_mamuontra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        o_masach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        o_ghichu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        o_tienphat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        o_them = new javax.swing.JButton();
        o_sua = new javax.swing.JButton();
        o_xoa = new javax.swing.JButton();
        o_ngaytra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý độc giả-Bùi Thị Mến");

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Table_CTMT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Table_CTMT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Table_CTMT.setForeground(new java.awt.Color(255, 0, 153));
        Table_CTMT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table_CTMT.setSelectionBackground(new java.awt.Color(255, 0, 153));
        Table_CTMT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_CTMTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_CTMT);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mã mượn trả:");

        o_mamuontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_mamuontraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Mã sách:");

        o_masach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_masachActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Ngày trả:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Ghi chú:");

        o_tienphat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_tienphatActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Tiền phạt:");

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

        o_ngaytra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_ngaytraActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\menbt\\Desktop\\chiTietMuonTra.jpg")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 102));
        jLabel10.setText("Chi tiết mượn trả");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(224, 224, 224)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(o_tienphat, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(o_them, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(o_ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(o_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(o_ngaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(o_masach, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(o_mamuontra, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(534, 534, 534)
                                .addComponent(o_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(o_mamuontra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(o_tienphat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(o_them, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(o_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(o_ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(o_masach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(o_ngaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(7, 7, 7))
                            .addComponent(o_xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void o_mamuontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_mamuontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_mamuontraActionPerformed

    private void o_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_themActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement ps = cnn.prepareStatement("insert into Bangchitietmuontra values(?,?,?,?,?) ");
            ps.setString(1, o_mamuontra.getText());
            ps.setString(2, o_masach.getText());
            ps.setString(3, o_ngaytra.getText());

            ps.setString(4, o_tienphat.getText());
            ps.setString(5, o_ghichu.getText());

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

    private void Table_CTMTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_CTMTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_CTMTMouseClicked

    private void o_ngaytraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_ngaytraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_ngaytraActionPerformed

    private void o_tienphatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_tienphatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_tienphatActionPerformed

    private void o_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_xoaActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement comm = cnn.prepareStatement("DELETE FROM Bangchitietmuontra\n"
                    + " WHERE [Mã mượn trả ] =?\n"
                    + "DELETE FROM Bangmuontra WHERE [Mã mượn trả]=?");
            comm.setString(1, Table_CTMT.getValueAt(Table_CTMT.getSelectedRow(), 0).toString());
            comm.setString(2, Table_CTMT.getValueAt(Table_CTMT.getSelectedRow(), 0).toString());
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

    private void o_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_suaActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement comm = cnn.prepareStatement("Update Bangchitietmuontra set [Mã sách]=?,[Ngày trả]=?,[Tiền phạt]=?,[Ghi chú]=? where [Mã mượn trả]=?");
            comm.setString(5, o_mamuontra.getText());
            comm.setString(1, o_masach.getText());
            comm.setString(2, o_ngaytra.getText());

            comm.setString(3, o_tienphat.getText());
            comm.setString(4, o_ghichu.getText());

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

    private void o_masachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_masachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_masachActionPerformed

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
            java.util.logging.Logger.getLogger(chiTietMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chiTietMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chiTietMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chiTietMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chiTietMuonTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_CTMT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField o_ghichu;
    private javax.swing.JTextField o_mamuontra;
    private javax.swing.JTextField o_masach;
    private javax.swing.JTextField o_ngaytra;
    private javax.swing.JButton o_sua;
    private javax.swing.JButton o_them;
    private javax.swing.JTextField o_tienphat;
    private javax.swing.JButton o_xoa;
    // End of variables declaration//GEN-END:variables
}
