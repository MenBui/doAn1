
package quanlithuvien;


import java.sql.*;


public class ConnectionDB {
    Connection cnn=null;
    
    Connection getConnectDB(){
        try {
            String uRL="jdbc:sqlserver://127.0.0.1:1433;databaseName=QLTV";
            String user="sa";
            String pass="01126461";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection(uRL , user , pass);
            System.out.println("Kết nối thành công");
        } catch (Exception e) {
            System.out.println("Kết nối không thành công");
        }
        
        return null;
    
    }

    public ResultSet GetData(String jtable) throws SQLException{
    Exception kq=null;
    Statement st=cnn.createStatement();
    String sql="select * from bangDocGia";
    kq = (Exception) st.executeQuery(sql);
    return (ResultSet) kq;
    }
   public static void main(String[] args) {
   ConnectionDB connection=new ConnectionDB();
   connection.connect();
}

    private void connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
