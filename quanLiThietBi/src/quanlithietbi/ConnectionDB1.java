package quanlithietbi;

import java.sql.*;

public class ConnectionDB1 {

    public static Connection getConnectDB() {
        Connection cnn = null;
        try {
            String uRL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QuanLyThietBi2";
            String user = "sa";
            String pass = "01126461";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection(uRL, user, pass);
            System.out.println("Kết nối thành công");
        } catch (Exception e) {
            System.out.println("Kết nối không thành công");
        }

        return cnn;

    }

}
