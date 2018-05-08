/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doituongquanly;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Lê Anh Tuấn
 */
public class DocGiaDAO {
    private Connection conn;
    private PreparedStatement pst;
     
    public void insertDocGias(List<DocGia> listDocGias) {
        try {
            conn = ConnectDB.getConnectDB();
            // Sét tự động commit false, để chủ động điều khiển
            conn.setAutoCommit(false);
             
            String query = "INSERT INTO DOCGIA (MADOCGIA,TENDOCGIA,NGAYSINH,GIOITINH,SODIENTHOAI,EMAIL,QUEQUAN)"
            + "VALUES (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(query);
             
            for (DocGia docgia : listDocGias) {
                pst.setString(1, docgia.getMADOCGIA());
                pst.setString(2, docgia.getTENDOCGIA());
                pst.setString(3, docgia.getNGAYSINH());
                pst.setString(4, docgia.getGIOITINH());
                pst.setString(5, docgia.getSODIENTHOAI());
                pst.setString(6, docgia.getEMAIL());
                pst.setString(7, docgia.getQUEQUAN());
                pst.addBatch();
            }
             
            pst.executeBatch();
             
            // Gọi commit() để commit giao dịch với DB
            conn.commit();
             
             
        } catch (Exception e) {
             
            e.printStackTrace();
            
             
        } finally {
             
            try {
                if (pst != null)
                    pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
             
        }
    }
}
