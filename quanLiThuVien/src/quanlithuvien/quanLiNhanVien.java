/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import Home.myViewerReport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import static quanlithuvien.ExcelHelperNV.readNV;

public class quanLiNhanVien extends javax.swing.JFrame {
    
    DefaultTableModel tbn = new DefaultTableModel();
    
    
    public quanLiNhanVien() {
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
            ResultSet rs = st.executeQuery("select * from Bangnhanvien");
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
                Table_NV.setModel(tbn);
            }
            Table_NV.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    if (Table_NV.getSelectedRow() >= 0) {
                        o_manv.setText(Table_NV.getValueAt(Table_NV.getSelectedRow(), 0) + "");
                        o_tennv.setText(Table_NV.getValueAt(Table_NV.getSelectedRow(), 1) + "");
                        o_ngaysinh.setText(Table_NV.getValueAt(Table_NV.getSelectedRow(), 2) + "");
                        o_gioitinh.setText(Table_NV.getValueAt(Table_NV.getSelectedRow(), 3) + "");
                        o_soCMND.setText(Table_NV.getValueAt(Table_NV.getSelectedRow(), 4) + "");
                        o_sodienthoai.setText(Table_NV.getValueAt(Table_NV.getSelectedRow(), 5) + "");
                        o_email.setText(Table_NV.getValueAt(Table_NV.getSelectedRow(), 6) + "");
                        o_quequan.setText(Table_NV.getValueAt(Table_NV.getSelectedRow(), 7) + "");
                        
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
        Table_NV = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        o_manv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        o_tennv = new javax.swing.JTextField();
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
        themFile = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý nhân viên-Bùi Thị Mến");
        setLocation(new java.awt.Point(270, 70));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_NV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Table_NV.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Table_NV.setForeground(new java.awt.Color(255, 0, 153));
        Table_NV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table_NV.setRowHeight(25);
        Table_NV.setSelectionBackground(new java.awt.Color(255, 204, 255));
        Table_NV.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Table_NV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_NVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_NV);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 920, 260));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mã nhân viên:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 30));

        o_manv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_manvActionPerformed(evt);
            }
        });
        jPanel1.add(o_manv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 156, 33));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tên nhân viên:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 30));

        o_tennv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_tennvActionPerformed(evt);
            }
        });
        jPanel1.add(o_tennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 156, 31));

        o_gioitinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_gioitinhActionPerformed(evt);
            }
        });
        jPanel1.add(o_gioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 156, 32));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Ngày sinh:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Giới tính:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 30));
        jPanel1.add(o_quequan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 156, 32));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Quê quán:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, 30));
        jPanel1.add(o_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 156, 32));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, 30));
        jPanel1.add(o_sodienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 156, 33));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Số ĐT:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, 30));

        o_soCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_soCMNDActionPerformed(evt);
            }
        });
        jPanel1.add(o_soCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 156, 33));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Số CMND:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 30));

        o_them.setBackground(new java.awt.Color(51, 153, 0));
        o_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_them.setForeground(new java.awt.Color(255, 255, 255));
        o_them.setText("Thêm");
        o_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_themActionPerformed(evt);
            }
        });
        jPanel1.add(o_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 77, 33));

        o_sua.setBackground(new java.awt.Color(51, 153, 0));
        o_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_sua.setForeground(new java.awt.Color(255, 255, 255));
        o_sua.setText("Sửa");
        o_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_suaActionPerformed(evt);
            }
        });
        jPanel1.add(o_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 77, 33));

        o_xoa.setBackground(new java.awt.Color(51, 153, 0));
        o_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_xoa.setForeground(new java.awt.Color(255, 255, 255));
        o_xoa.setText("Xóa");
        o_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_xoaActionPerformed(evt);
            }
        });
        jPanel1.add(o_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 77, 32));

        o_ngaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_ngaysinhActionPerformed(evt);
            }
        });
        jPanel1.add(o_ngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 156, 32));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Online_Support_96px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 102));
        jLabel10.setText("Quản lý nhân viên");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thoát");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 77, 32));

        themFile.setBackground(new java.awt.Color(0, 102, 204));
        themFile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        themFile.setText("Thêm file");
        themFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themFileActionPerformed(evt);
            }
        });
        jPanel1.add(themFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 100, 30));

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Xuất file");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 100, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("SV: Bùi Thị Mến");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void o_manvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_manvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_manvActionPerformed

    private void o_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_themActionPerformed
        try {
            ConnectionDB a = new ConnectionDB();
            Connection cnn = a.getConnectDB();
            PreparedStatement ps = cnn.prepareStatement("insert into Bangnhanvien values(?,?,?,?,?,?,?,?) ");
            ps.setString(1, o_manv.getText());
            ps.setString(2, o_tennv.getText());
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

    private void Table_NVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_NVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_NVMouseClicked

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
                    + "(SELECT [Mã NV ] FROM Bangmuontra \n"
                    + "WHERE [Mã NV]= ? )\n"
                    + "DELETE FROM Bangmuontra\n"
                    + "WHERE [Mã NV]= ?\n"
                    + "DELETE FROM Bangnhanvien\n"
                    + "WHERE [Mã NV]= ?");
            comm.setString(1, Table_NV.getValueAt(Table_NV.getSelectedRow(), 0).toString());
            comm.setString(2, Table_NV.getValueAt(Table_NV.getSelectedRow(), 0).toString());
            comm.setString(3, Table_NV.getValueAt(Table_NV.getSelectedRow(), 0).toString());
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
            PreparedStatement comm = cnn.prepareStatement("Update Bangnhanvien set [Tên NV] =?,[Ngày sinh]=?,[Giới tính]=?,[Số CMND]=?,[Số điện thoại]=?,Email=?,[Quê quán]=? where [Mã NV]=? ");
            comm.setString(8, o_manv.getText());
            comm.setString(1, o_tennv.getText());
            comm.setString(2, o_ngaysinh.getText());
            comm.setString(3, o_gioitinh.getText());
            comm.setString(4, o_soCMND.getText());
            comm.setString(5, o_sodienthoai.getText());
            comm.setString(6, o_email.getText());
            comm.setString(7, o_quequan.getText());
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

    private void o_tennvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_tennvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_tennvActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        int p = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            setVisible(false);
            quanLi ql = new quanLi();
            ql.setVisible(true);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void themFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themFileActionPerformed
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
        loadData();
    }//GEN-LAST:event_themFileActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String NV = "D:\\Java\\quanLiThuVien\\src\\bieuMau\\dsNhanvien.jasper";
        myViewerReport viewer = new myViewerReport(NV, null);
        viewer.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(quanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quanLiNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_NV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField o_manv;
    private javax.swing.JTextField o_ngaysinh;
    private javax.swing.JTextField o_quequan;
    private javax.swing.JTextField o_soCMND;
    private javax.swing.JTextField o_sodienthoai;
    private javax.swing.JButton o_sua;
    private javax.swing.JTextField o_tennv;
    private javax.swing.JButton o_them;
    private javax.swing.JButton o_xoa;
    private javax.swing.JButton themFile;
    // End of variables declaration//GEN-END:variables

}
