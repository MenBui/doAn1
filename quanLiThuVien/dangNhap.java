/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import javax.swing.JOptionPane;

/**
 *
 * @author menbt
 */
public class dangNhap extends javax.swing.JFrame {

    /**
     * Creates new form dangNhap
     */
    public dangNhap() {
        initComponents();
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
        o_nhap = new javax.swing.JLabel();
        o_matkhau = new javax.swing.JLabel();
        o_nhap1 = new javax.swing.JTextField();
        o_matkhau1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập-Bùi Thị Mến");
        setLocation(new java.awt.Point(400, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setAlignmentX(100.0F);
        jPanel1.setAlignmentY(100.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Đăng Nhập");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        o_nhap.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        o_nhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o_nhap.setText("UserName:");
        jPanel1.add(o_nhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, 50));

        o_matkhau.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        o_matkhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o_matkhau.setText("PassWord:");
        jPanel1.add(o_matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 90, 50));

        o_nhap1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o_nhap1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        o_nhap1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        o_nhap1.setName(""); // NOI18N
        o_nhap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_nhap1ActionPerformed(evt);
            }
        });
        jPanel1.add(o_nhap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 231, 250, 30));

        o_matkhau1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o_matkhau1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        o_matkhau1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(o_matkhau1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 294, 250, 30));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đăng Nhập");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\menbt\\Desktop\\BK.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setAlignmentX(100.0F);
        jLabel2.setAlignmentY(100.0F);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 136, 172));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Trường Đại học Bách Khoa Hà Nội");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\menbt\\Downloads\\ramdisk_crop_178900319_suLKmSi.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1 = o_nhap1.getText();        
        String s2 = o_matkhau1.getText();
        if ((s1.contains("menmen")) && (s2.contains("654321"))) {
            setVisible(false);
            quanLi ql = new quanLi();
            ql.setVisible(true);
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công.");
        } else {
            JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng!");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            System.exit(0);   }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void o_nhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_nhap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_nhap1ActionPerformed

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
            java.util.logging.Logger.getLogger(dangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel o_matkhau;
    private javax.swing.JPasswordField o_matkhau1;
    private javax.swing.JLabel o_nhap;
    private javax.swing.JTextField o_nhap1;
    // End of variables declaration//GEN-END:variables
}
