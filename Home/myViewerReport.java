/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import quanlithuvien.ConnectionDB;
import java.awt.Container;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Bi Trẩn
 */
public
        class myViewerReport extends javax.swing.JFrame {

    public
            myViewerReport(String filename, HashMap parameter) {
        super("View Report");
        try {
            JasperPrint print = JasperFillManager.fillReport(filename, parameter, ConnectionDB.getConnectDB());
            JRStyle[] style = print.getStyles();
            for (int i = 0; i < style.length; i++) {
                style[i].setPdfFontName("C:/Windows/Fonts/tahoma.ttf");
            }
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        setBounds(100,20,1180,700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bùi Thị Mến");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
