/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import Home.myViewerReport;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeMap;
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
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static quanlithuvien.ExcelHelperSach.readSach;

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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lý độc giả-Bùi Thị Mến");
        setLocation(new java.awt.Point(270, 70));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_S.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Table_S.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Table_S.setForeground(new java.awt.Color(255, 0, 153));
        Table_S.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table_S.setRowHeight(25);
        Table_S.setSelectionBackground(new java.awt.Color(255, 204, 255));
        Table_S.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Table_S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_SMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_S);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 830, 260));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mã sách:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 30));

        o_masach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_masachActionPerformed(evt);
            }
        });
        jPanel1.add(o_masach, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 156, 33));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tên sách:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 30));

        o_tensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_tensachActionPerformed(evt);
            }
        });
        jPanel1.add(o_tensach, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 156, 31));

        o_theloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_theloaiActionPerformed(evt);
            }
        });
        jPanel1.add(o_theloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 156, 32));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Tác giả:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Thể loại:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 30));
        jPanel1.add(o_soluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 156, 32));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Số lượng:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 30));
        jPanel1.add(o_dongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 156, 32));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Đơn giá:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, 30));
        jPanel1.add(o_namxuatban, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 156, 33));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Năm xuất bản:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, 30));

        o_nhaxuatban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_nhaxuatbanActionPerformed(evt);
            }
        });
        jPanel1.add(o_nhaxuatban, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 156, 33));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Nhà xuất bản:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 30));

        o_them.setBackground(new java.awt.Color(51, 153, 0));
        o_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_them.setForeground(new java.awt.Color(255, 255, 255));
        o_them.setText("Thêm");
        o_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_themActionPerformed(evt);
            }
        });
        jPanel1.add(o_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 77, 33));

        o_sua.setBackground(new java.awt.Color(51, 153, 0));
        o_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_sua.setForeground(new java.awt.Color(255, 255, 255));
        o_sua.setText("Sửa");
        o_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_suaActionPerformed(evt);
            }
        });
        jPanel1.add(o_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 77, 33));

        o_xoa.setBackground(new java.awt.Color(51, 153, 0));
        o_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        o_xoa.setForeground(new java.awt.Color(255, 255, 255));
        o_xoa.setText("Xóa");
        o_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_xoaActionPerformed(evt);
            }
        });
        jPanel1.add(o_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 77, 32));

        o_tacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_tacgiaActionPerformed(evt);
            }
        });
        jPanel1.add(o_tacgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 156, 32));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Books_96px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 102));
        jLabel10.setText("Quản Lý Sách");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 77, 32));

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Xuất file");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 100, 30));

        jButton3.setBackground(new java.awt.Color(0, 102, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Thêm file");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser JF = new JFileChooser();
        JF.setDialogTitle("Chọn 1 file execl để nhập dữ liệu.");
        int result = JF.showOpenDialog(null);
        String excelPath = "";
        if (result == JFileChooser.APPROVE_OPTION) {
            excelPath = JF.getSelectedFile().getAbsolutePath();

        }
        try {
            readSach(excelPath);
        } catch (Exception e) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, e);
        }
        loadData();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String NV1 = "D:\\Java\\quanLiThuVien\\src\\bieuMau\\ttSach.jasper";
        myViewerReport viewer = new myViewerReport(NV1, null);
        viewer.setVisible(true);   // TODO add your handling code here:
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
