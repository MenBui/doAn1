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
public class SachDAO {
    private Connection conn;
    private PreparedStatement pst;
     
    public void insertSachs(List<Sach> listSachs) {
        try {
            conn = ConnectDB.getConnectDB();
            // Sét tự động commit false, để chủ động điều khiển
            conn.setAutoCommit(false);
             
            String query = "INSERT INTO SACH (MASACH,TENSACH,THELOAI,TACGIA,NHA_XB,SOLUONG)"
            + "VALUES (?,?,?,?,?,?)";
            pst = conn.prepareStatement(query);
             
            for (Sach sach : listSachs) {
                pst.setString(1, sach.getMASACH());
                pst.setString(2, sach.getTENSACH());
                pst.setString(3, sach.getTHELOAI());
                pst.setString(4, sach.getTACGIA());
                pst.setString(5, sach.getNHA_XB());
                pst.setInt(6, sach.getSOLUONG());
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
