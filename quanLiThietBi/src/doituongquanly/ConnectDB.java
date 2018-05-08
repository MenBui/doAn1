/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doituongquanly;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lê Anh Tuấn
 */
public class ConnectDB {
    public static Connection getConnectDB(){
        Connection conn = null;
        String connectURL = "jdbc:sqlserver://localhost:51158; databaseName=QuanLiThuVien; user=sa; password=123456;";
        try {
            conn = DriverManager.getConnection(connectURL);
            if(conn != null) System.out.println(" Connect Success!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
        
    }
}
