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
public class NhanVienDAO {
    private Connection conn;
    private PreparedStatement pst;
     
    public void insertNhanViens(List<NhanVien> listNhanViens) {
        try {
            conn = ConnectDB.getConnectDB();
            // Sét tự động commit false, để chủ động điều khiển
            conn.setAutoCommit(false);
             
            String query = "INSERT INTO NHANVIEN (MANV,TENNHANVIEN,NGAYSINH,GIOITINH,SODIENTHOAI,EMAIL,CHUCVU)"
            + "VALUES (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(query);
             
            for (NhanVien nhanvien : listNhanViens) {
                pst.setString(1, nhanvien.getMANV());
                pst.setString(2, nhanvien.getTENNHANVIEN());
                pst.setString(3, nhanvien.getNGAYSINH());
                pst.setString(4, nhanvien.getGIOITINH());
                pst.setString(5, nhanvien.getSODIENTHOAI());
                pst.setString(6, nhanvien.getEMAIL());
                pst.setString(7, nhanvien.getCHUCVU());
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
